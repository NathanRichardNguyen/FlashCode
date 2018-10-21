package com.example.nathanrnguyen.flashcode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MultipleChoiceActivity extends AppCompatActivity {

    private QuestionLibrary questionLibrary = new QuestionLibrary();
    private TextView question;
    private CardView choiceA, choiceB, choiceC, choiceD;

    private String answer;
    private int questionNumber = 0;

    private TextView textA, textB, textC, textD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice);

        // Home and Back Button
        ImageView backButton = findViewById(R.id.backButton);
        ImageView homeButton = findViewById(R.id.homeButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MultipleChoiceActivity.this, TestActivity.class));
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MultipleChoiceActivity.this, MenuActivity.class));
            }
        });

        // Questions and Answers
        choiceA = findViewById(R.id.optionA);
        choiceB = findViewById(R.id.optionB);
        choiceC = findViewById(R.id.optionC);
        choiceD = findViewById(R.id.optionD);

        textA = findViewById(R.id.textA);
        textB = findViewById(R.id.textB);
        textC = findViewById(R.id.textC);
        textD = findViewById(R.id.textD);

        question = findViewById(R.id.question);

        updateQuestion(); // Calls the method updateQuestion()

        choiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            // if option A is selected and it matches the correct answer, a toast message saying 'Correct!' appears
            // the updateQuestion method is then called to get the next question
            // if it is not correct, a toast message saying 'Please try again!' appears
            public void onClick(View view) {
                if (textA.getText() == answer) {
                    updateQuestion();
                    Toast.makeText(MultipleChoiceActivity.this, "Correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MultipleChoiceActivity.this, "Please try again!", Toast.LENGTH_SHORT).show();

                }
            }

        });

        choiceB.setOnClickListener(new View.OnClickListener() {
            // if option B is selected and it matches the correct answer, a toast message saying 'Correct!' appears
            // the updateQuestion method is then called to get the next question
            // if it is not correct, a toast message saying 'Please try again!' appears
            @Override
            public void onClick(View view) {
                if (textB.getText() == answer) {
                    updateQuestion();
                    Toast.makeText(MultipleChoiceActivity.this, "Correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MultipleChoiceActivity.this, "Please try again!", Toast.LENGTH_SHORT).show();

                }
            }

        });

        choiceC.setOnClickListener(new View.OnClickListener() {
            // if option C is selected and it matches the correct answer, a toast message saying 'Correct!' appears
            // the updateQuestion method is then called to get the next question
            // if it is not correct, a toast message saying 'Please try again!' appears
            @Override
            public void onClick(View view) {
                if (textC.getText() == answer) {
                    updateQuestion();
                    Toast.makeText(MultipleChoiceActivity.this, "Correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MultipleChoiceActivity.this, "Please try again!", Toast.LENGTH_SHORT).show();

                }
            }

        });

        choiceD.setOnClickListener(new View.OnClickListener() {
            // if option D is selected and it matches the correct answer, a toast message saying 'Correct!' appears
            // the updateQuestion method is then called to get the next question
            // if it is not correct, a toast message saying 'Please try again!' appears
            @Override
            public void onClick(View view) {
                if (textD.getText() == answer) {
                    updateQuestion();
                    Toast.makeText(MultipleChoiceActivity.this, "Correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MultipleChoiceActivity.this, "Please try again!", Toast.LENGTH_SHORT).show();

                }
            }

        });
    }
        // Updates the question and answers in the display with relevant question data from the questions and possibleChoices
        // array using the getQuestion and getChoice_ method in the Question Library class.
        // Retrieves the correct answer from the correctAnswer array using the getCorrectAnswer method in the QuestionLibrary class.
        // Iterates the method by one to get the next question.
        private void updateQuestion () {
            question.setText(questionLibrary.getQuestion(questionNumber));
            textA.setText(questionLibrary.getChoiceA(questionNumber));
            textB.setText(questionLibrary.getChoiceB(questionNumber));
            textC.setText(questionLibrary.getChoiceC(questionNumber));
            textD.setText(questionLibrary.getChoiceD(questionNumber));

            answer = questionLibrary.getCorrectAnswer(questionNumber);
            questionNumber++;
        }

    }
