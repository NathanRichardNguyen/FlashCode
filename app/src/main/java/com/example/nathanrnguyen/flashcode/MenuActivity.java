package com.example.nathanrnguyen.flashcode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {
    private CardView loopCard, arrayCard, methodCard, classesCard, visibilityCard, errorsCard, dataCard, switchCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardmenu);

        ImageView backButton = findViewById(R.id.backButton);
        ImageView homeButton = findViewById(R.id.homeButton);

        CardView loopCard = findViewById(R.id.loopCard);
        CardView arrayCard = findViewById(R.id.arrayCard);
        CardView methodCard = findViewById(R.id.methodCard);
        CardView classesCard = findViewById(R.id.classesCard);
        CardView visibilityCard = findViewById(R.id.visibilityCard);
        CardView errorsCard = findViewById(R.id.errorsCard);
        CardView dataCard = findViewById(R.id.dataCard);
        CardView switchCard = findViewById(R.id.switchCard);

        loopCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, LoopsActivity.class));
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, MenuActivity.class));
            }
        });


        // other topics

        arrayCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, SoonActivity.class));
            }
        });

        methodCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, SoonActivity.class));
            }
        });

        classesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, SoonActivity.class));
            }
        });

        visibilityCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, SoonActivity.class));
            }
        });

        errorsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, SoonActivity.class));
            }
        });

        dataCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, SoonActivity.class));
            }
        });

        switchCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, SoonActivity.class));
            }
        });

    }

}
