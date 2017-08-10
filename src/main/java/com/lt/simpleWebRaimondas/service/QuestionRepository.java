package com.lt.simpleWebRaimondas.service;

import com.lt.simpleWebRaimondas.domain.Question;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

interface QuestionRepository extends JpaRepository<Question, Integer> {
   // @Query(Select question from Questions);


}
