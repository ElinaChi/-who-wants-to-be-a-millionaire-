package com.example.triviagame.domain;

public class AskFriendHelpOption extends HelpOption {
        @Override
        public void invoke(Question question) {
            System.out.println("Friend tells that most probably is this one - " + question.getCorrectAnswer() + " - 99.7%");
            setUsed(true);
            setInvoked(false);
        }
    }

