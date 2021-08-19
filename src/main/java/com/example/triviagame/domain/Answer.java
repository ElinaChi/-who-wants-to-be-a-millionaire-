package com.example.triviagame.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
    @NoArgsConstructor
    @Entity
    @Table(name = "ANSWER")
    public class Answer {
        @Id
        @GeneratedValue
        private Long id;
        private String text;
        private boolean isCorrect;
        private String letter;

    @ManyToOne(fetch = FetchType.LAZY)
    private Question question;

        public Answer(String text, boolean isCorrect, String letter) {
            if(text.isEmpty()){
              System.out.println("Answer text should not be empty");
            }
            this.text = text;
            this.isCorrect = isCorrect;
            this.letter = letter;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Answer)) return false;
        return id != null && id.equals(((Answer) o).getId());
    }

        @Override
        public int hashCode() {
            return getClass().hashCode();
        }

        @Override
        public String toString() {
            return letter + ". " + text;
        }
    }

