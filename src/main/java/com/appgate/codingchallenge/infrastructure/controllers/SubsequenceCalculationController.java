package com.appgate.codingchallenge.infrastructure.controllers;

import com.appgate.codingchallenge.application.services.SubsequenceCalculationService;
import com.appgate.codingchallenge.domain.models.InputStrings;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api/v1")
public class SubsequenceCalculationController {

    private final SubsequenceCalculationService taskService;

    public SubsequenceCalculationController(SubsequenceCalculationService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/subsequence")
    public ResponseEntity<Integer> createSubsequenceCalculation(@Valid @RequestBody InputStrings inputStrings) throws ExecutionException, InterruptedException {
        return new ResponseEntity<Integer>(taskService.CalculateSubsequence(inputStrings).get(), HttpStatus.OK);
    }
}
