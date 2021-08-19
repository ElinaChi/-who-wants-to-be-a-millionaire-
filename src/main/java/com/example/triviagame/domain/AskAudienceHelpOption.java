package com.example.triviagame.domain;

import java.util.List;
import java.util.Random;

public class AskAudienceHelpOption extends HelpOption {


    @Override
    public void invoke(Question question) {
        System.out.println("Auditory voted: ");
        List<Answer> wrongAnswers = question.getWrongAnswers();
        int wrongAnswerProbabilityLimit = 100 / wrongAnswers.size() - 10;
        int correctAnswerProbabilityLimit = 100 - wrongAnswerProbabilityLimit * wrongAnswers.size();

        for (Answer wrongAnswer : wrongAnswers) {
            System.out.println("  " + wrongAnswer + " - " + new Random().nextInt(wrongAnswerProbabilityLimit) + "%");
        }
        System.out.println(" " + question.getCorrectAnswer() + " - " + correctAnswerProbabilityLimit + "%");

        setUsed(true);
        setInvoked(false);
    }

}
