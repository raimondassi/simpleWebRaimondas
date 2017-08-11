package com.lt.simpleWebRaimondas;

import com.lt.simpleWebRaimondas.controler.dto.QuizElementDTO;
import com.lt.simpleWebRaimondas.domain.Answer;
import com.lt.simpleWebRaimondas.domain.Question;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created by Raimondas on 2017.08.08.
 */
@SpringBootApplication
public class SampleProjectProjectApplication {

    private static Question question;
    private static List<Answer> answer;
    public static void main(String[] args) {

        SpringApplication.run(SampleProjectProjectApplication.class, args);
       // QuizElementDTO quizElementDTO=new QuizElementDTO(question.getQuestion(),answer.add() );

    }
}
