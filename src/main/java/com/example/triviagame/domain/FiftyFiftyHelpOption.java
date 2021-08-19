package com.example.triviagame.domain;

import java.util.List;
import java.util.Random;

public class FiftyFiftyHelpOption extends HelpOption {

    @Override
    public void invoke(Question question) {
        List<Answer> wrongAnswers = question.getWrongAnswers();
        Answer wrongAnswer = wrongAnswers.get(new Random().nextInt(wrongAnswers.size()));

        System.out.println("Computer says: ");
        System.out.println("  " + wrongAnswer + " - 50%");
        System.out.println("  " + question.getCorrectAnswer() + " - 50%");

        setUsed(true);
        setInvoked(false);
    }
}
