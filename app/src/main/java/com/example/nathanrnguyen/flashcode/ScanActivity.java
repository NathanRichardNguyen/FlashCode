package com.example.nathanrnguyen.flashcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.Toast;

import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;

import java.io.IOException;


public class ScanActivity extends AppCompatActivity {
    SurfaceView mcameraView;
    BarcodeDetector mbarcodeDetector;
    CameraSource mcameraSource;
    SurfaceHolder msurfaceHolder;
    private static final String TAG = "ScanActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        mcameraView = findViewById(R.id.cameraView);

        mcameraView.setZOrderMediaOverlay(true);
        msurfaceHolder = mcameraView.getHolder();
        mbarcodeDetector = new BarcodeDetector.Builder(getApplicationContext())
                .setBarcodeFormats(Barcode.QR_CODE)
                .build();

        if(!mbarcodeDetector.isOperational()) {
            Toast.makeText(getApplicationContext(), "There was an error setting up the QR Code detector", Toast.LENGTH_LONG).show();
            Log.d(TAG, "Barcode detector has an error");
            this.finish();
        }
        mcameraSource = new CameraSource.Builder(this, mbarcodeDetector)
                .setFacing(CameraSource.CAMERA_FACING_BACK)
                .setRequestedFps(24)
                .setAutoFocusEnabled(true)
                .setRequestedPreviewSize(1920, 1024)
                .build();

        mcameraView.getHolder().addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                try{
                    if(ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
                        mcameraSource.start(mcameraView.getHolder());
                        Log.d(TAG, "Camera permission successfully granted");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {

            }
        });
        mbarcodeDetector.setProcessor(new Detector.Processor<Barcode>() {
            @Override
            public void release() {

            }

            @Override
            public void receiveDetections(Detector.Detections<Barcode> detections) {
               final SparseArray<Barcode> barcodeArray = detections.getDetectedItems();
               if(barcodeArray.size() > 0) {
                   Intent intent = new Intent();
                   intent.putExtra("barcoderesult", barcodeArray.valueAt(0));
                   setResult(RESULT_OK, intent);
                   finish();
                   Log.d(TAG, "receiveDetections: QR detected");
               } else {
                   Log.d(TAG, "receiveDetections: No QR Code detected");
               }

            }
        });
    }
}
