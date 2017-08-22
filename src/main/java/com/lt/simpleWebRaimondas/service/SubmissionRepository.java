package com.lt.simpleWebRaimondas.service;

import com.lt.simpleWebRaimondas.domain.Answer;
import com.lt.simpleWebRaimondas.domain.Submission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ozc on 2017.08.16.
 */
public interface SubmissionRepository extends JpaRepository<Submission, Integer>{
}
