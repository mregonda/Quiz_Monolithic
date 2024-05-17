package com.manideep.quiz_monolithic.dao;

import com.manideep.quiz_monolithic.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
