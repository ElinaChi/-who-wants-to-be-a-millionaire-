package com.example.triviagame.repository;

import com.example.triviagame.domain.Question;

import java.util.List;

public interface QuestionRepository {
    List<Question> findQuestionsByLevel(int level);

    boolean save(Question question);

    boolean delete(Question question);

    List<Question> findAll();

    Question findById(Long id);

    void deleteById(Long id);
}


