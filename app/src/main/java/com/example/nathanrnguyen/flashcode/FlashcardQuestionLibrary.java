package com.example.nathanrnguyen.flashcode;

public class FlashcardQuestionLibrary {

    private String questions [] = {
            "What is the purpose of updating the variable value in a loop statement?",

            "What is the output of this code:\n\n" +
                    "  do {\n" +
                    "  System.out.println(“12345”); \n" +
                    "  } while (x < 5); \n",

            "What is the purpose of a continue statement?",

            "A while loop checks the testing condition _____ executing the _____ whereas a _____ checks the condition _____ the completion of the first iteration.",

            "Write a loop, in its most simplest form, that prints ABC 2 times.",

            "What is the basic syntax of a do-while loop?",

};

    public String getQuestion(int a) {
        String question = questions[a];
        return question;
    }
}
