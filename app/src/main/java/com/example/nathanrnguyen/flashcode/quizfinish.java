package com.example.nathanrnguyen.flashcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class quizfinish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizfinish);

        TextView quizfinishtext = findViewById(R.id.quizfinishtext);

        ImageView homebutton = findViewById(R.id.homeButton);
        ImageView backbutton = findViewById(R.id.backButton);

        quizfinishtext.setText("Congratulations you have successfully completed the Java Quiz!");

        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(quizfinish.this, MenuActivity.class));
            }
        });

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(quizfinish.this, MultipleChoiceActivity.class));
            }
        });
    }

}
