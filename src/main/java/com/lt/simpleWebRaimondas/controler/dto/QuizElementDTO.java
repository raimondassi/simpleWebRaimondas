package com.lt.simpleWebRaimondas.controler.dto;

import java.util.List;

/**
 * Created by ozc on 2017.08.11.
 */
public class QuizElementDTO {
    private String question;
    private List<AnswerDTO> answers;

    public QuizElementDTO(String question, List<AnswerDTO> answers){
        this.question=question;
        this.answers=answers;
    }



    public String getQuestion(){
        return question;
    }

    public List<AnswerDTO> getAnswers(){
        return answers;
    }


}
