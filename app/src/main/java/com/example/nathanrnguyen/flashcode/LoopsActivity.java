package com.example.nathanrnguyen.flashcode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class LoopsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loops_activity);

        ImageView backButton = findViewById(R.id.backButton);
        ImageView homeButton = findViewById(R.id.homeButton);

        CardView learnCard = findViewById(R.id.learnCard);
        CardView testCard = findViewById(R.id.testCard);

        learnCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoopsActivity.this, TheoryActivity.class));
            }
        });

        testCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoopsActivity.this, TestActivity.class));
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoopsActivity.this, MenuActivity.class));
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoopsActivity.this, MenuActivity.class));
            }
        });



    }
}
