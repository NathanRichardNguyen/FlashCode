package com.example.nathanrnguyen.flashcode;

public class QuestionLibrary {



    private String questions [] = {
            //Q1
            "Which loop has their testing condition checked before the initial execution?",

            //Q2
            "What is the output of the following code?\n\n" +
                    "        int i = 0;\n" +
                    "        while (i < 3) {\n" +
                    "        System.out.println(“A”);\n" +
                    "        i++;\n" +
                    "        } ",
            //Q3
            "How many times will this loop be executed?\n\n" +
                    "        for (int i = 1; i < 5; i++) {\n" +
                    "        System.out.println(“Java is fun”);\n" +
                    "        } ",

            //Q4
            "What will be printed at the end of this loop?\n\n" +
                    "        for (int i = 0; i != 0; i++) {\n" +
                    "        System.out.println(“Hello!”);\n" +
                    "        } ",

            //Q5
            "Which element of a loop must return a ‘true’ Boolean value in order for the statements to be executed?",

            //Q6
            "What is the output of this code:\n\n" +
                    "        int i = 0;\n" +
                    "        while (i < 2) {\n" +
                    "        System.out.println(“Hi!”);\n" +
                    "        i++; \n" +
                    "        }\n ",
                    "        System.out.println(“Bye!”);",
    };

    private String options [][] = {
        {"For Loop", "While Loop", "Do While Loop", "Both A and B"},
        {"AAA", "AA", "A\nA", "A\nA\nA"},
        {"5 times", "4 times", "6 times", "There is a compile error"},
        {"It prints nothing", "There is a compile error", "Prints Hello! infinitely", "Prints Hello! once"},
            {"Testing Condition", "Initialization Condition", "Increment Update", "Decrement Update"},
            {"Hi!Bye!Hi!Bye!", "Hi!Hi!Bye!", "Hi!\nHi!\nBye!", "Hi!\nBye!\nHi!\nBye!"},
    };


    private String correctAnswer [] = {
            "Both A and B", //D
            "A\nA\nA", //D
            "4 times", //B
            "It prints nothing", //A
            "Testing Condition",//A
            "Hi!\nHi!\nBye!",
    };

    // Returns question
    public String getQuestion(int a) {
        String question = questions[a];
        return question;
    }

    // Returns option A
    public String getChoiceA(int a) {
        String choiceA = options[a][0];
        return choiceA;
    }

    // Returns option B
    public String getChoiceB(int a) {
        String choiceB = options[a][1];
        return choiceB;
    }

    // Returns option C
    public String getChoiceC(int a) {
        String choiceC = options[a][2];
        return choiceC;
    }

    // Returns option D
    public String getChoiceD(int a) {
        String choiceD = options[a][3];
        return choiceD;
    }

    // Returns correct answer
    public String getCorrectAnswer(int a) {
        String answer = correctAnswer[a];
        return answer;
    }
    public String[] getQuestions() {
        return questions;
    }






}
