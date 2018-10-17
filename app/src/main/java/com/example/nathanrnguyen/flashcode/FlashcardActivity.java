package com.example.nathanrnguyen.flashcode;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.Image;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.vision.barcode.Barcode;


public class FlashcardActivity extends AppCompatActivity {
    public static final int REQUEST_CODE = 100;
    public static final int PERMISSION_REQUEST = 200;
    private static final String TAG = "FlashcardActivity";


    ImageView questionicon;
    ImageView answericon;
    TextView questiontext;
    TextView answertext;
    CardView answercard;
    CardView questioncard;
    Button scanbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcard);
        questiontext = findViewById(R.id.questiontext);
        answertext = findViewById(R.id.answertext);
        scanbtn = findViewById(R.id.scbutton);
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            Log.d(TAG, "onCreate: Camera permissions not set");
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, PERMISSION_REQUEST);
            }

        scanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ScanActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });


    }
    //If the camera activity returns a result, this method is run
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            final Barcode qrcode = data.getParcelableExtra("barcoderesult");
            answertext.post(new Runnable() {
                @Override
                public void run() {
                    answertext.setText(qrcode.displayValue);
                }
            });
        }

    }
}
