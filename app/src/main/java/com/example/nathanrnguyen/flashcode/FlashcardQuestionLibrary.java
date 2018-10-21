package com.example.nathanrnguyen.flashcode;

public class FlashcardQuestionLibrary {

    private String questions [] = {
            "What is the purpose of updating the variable value in a loop statement?",

            "What is the output of:"
    };

    public String getQuestion(int a) {
        String question = questions[a];
        return question;
    }
}
