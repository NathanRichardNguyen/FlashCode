package com.example.nathanrnguyen.flashcode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class LoopsActivity extends AppCompatActivity {
    private static final String TAG = "LoopsActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loops);

        ImageView backButton = findViewById(R.id.backButton);
        ImageView homeButton = findViewById(R.id.homeButton);

        CardView learnCard = findViewById(R.id.learnCard);
        CardView testCard = findViewById(R.id.testCard);

        //onClick listeners for various buttons on screen
        learnCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoopsActivity.this, TheoryActivity.class));
                Log.d(TAG, "onClick: Theory activity started");
            }
        });

        testCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoopsActivity.this, TestActivity.class));
                Log.d(TAG, "onClick: Test activity started");
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoopsActivity.this, MenuActivity.class));
                Log.d(TAG, "onClick: Menu activity started (back button)");
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoopsActivity.this, MenuActivity.class));
                Log.d(TAG, "onClick: Menu activity started");
            }
        });



    }
}
