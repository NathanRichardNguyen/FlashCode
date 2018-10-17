package com.example.nathanrnguyen.flashcode;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.TextView;


public class FlashcardActivity extends AppCompatActivity {

    ImageView questionicon;
    ImageView answericon;
    TextView questiontext;
    TextView answertext;
    CardView answercard;
    CardView questioncard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcard);
        questiontext = findViewById(R.id.questiontext);
        answertext = findViewById(R.id.answertext);



    }
}
