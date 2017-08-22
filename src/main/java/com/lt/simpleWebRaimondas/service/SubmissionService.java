package com.lt.simpleWebRaimondas.service;

import com.lt.simpleWebRaimondas.domain.Answer;
import com.lt.simpleWebRaimondas.domain.Submission;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Component
public class SubmissionService {
    private SubmissionRepository submissionRepository;


    public SubmissionService(SubmissionRepository submissionRepository) {
        this.submissionRepository = submissionRepository;
    }


    @Transactional
    public void saveSubmissionToDB(Submission submission) {
        submissionRepository.save(submission);
    }
}


