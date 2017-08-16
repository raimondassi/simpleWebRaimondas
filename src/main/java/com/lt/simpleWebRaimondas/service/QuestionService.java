package com.lt.simpleWebRaimondas.service;

import com.lt.simpleWebRaimondas.domain.Answer;
import com.lt.simpleWebRaimondas.domain.AnswerType;
import com.lt.simpleWebRaimondas.domain.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class QuestionService {
    private QuestionRepository questionRepository;


    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    @Transactional(readOnly = true)
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }


    @Transactional
    public void saveQuestionToDB(Question question) {
        questionRepository.save(question);
    }


    public  Question saveQuestionsAndAnswersToDB(String questionText, AnswerType answerType, List<String> answer) {
        Question question = new Question(questionText, answerType);
        //Answer answerResult=new Answer(answer);
        question = questionRepository.saveAndFlush(question);
        return question;
    }
}
