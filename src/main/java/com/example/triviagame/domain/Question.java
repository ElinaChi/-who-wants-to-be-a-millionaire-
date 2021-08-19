package com.example.triviagame.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;


@Data
@NoArgsConstructor
@Entity
@Table(name = "QUESTION")
public class Question {
    @Id
    @GeneratedValue
    private Long id;
    private int score;
    private int level;
    private String text;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Answer> answers = new HashSet<>();

    public Question(int score, int level, String text, Set<Answer> answers) {
        this(score, level, text);
        this.answers = answers;
        this.answers.forEach(a -> a.setQuestion(this));
    }

    public Question(int score, int level, String text) {
        if (text.isEmpty()) {
            System.out.println("Question text should not be empty");
        }
        if (score < 0) {
            System.out.println("Score must be greater than 0");
        }
        if (level < 0) {
            System.out.println("Level must be greater than 0");
        }
        this.score = score;
        this.level = level;
        this.text = text;
    }

    public Answer getCorrectAnswer() {
        for (Answer answer : answers) {
            if (answer.isCorrect())
                return answer;
        }
        return null;
    }

    public List<Answer> getWrongAnswers() {
        List<Answer> wrongAnswers = new ArrayList<>();
        for (Answer answer : answers) {
            if (!answer.isCorrect()) {
                wrongAnswers.add(answer);
            }
        }
        Collections.shuffle(wrongAnswers);
        return wrongAnswers;
    }

    public void addAnswer(Answer answer) {
        answers.add(answer);
        answer.setQuestion(this);
    }

    public void removeAnswer(Answer answer) {
        answers.add(answer);
        answer.setQuestion(null);
    }
}

