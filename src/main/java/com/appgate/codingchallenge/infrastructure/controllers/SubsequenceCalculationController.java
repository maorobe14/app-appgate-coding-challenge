package com.appgate.codingchallenge.infrastructure.controllers;

import com.appgate.codingchallenge.application.services.TaskService;
import com.appgate.codingchallenge.domain.models.InputStrings;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SubsequenceCalculationController {

    private final TaskService taskService;

    public SubsequenceCalculationController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/subsequence")
    public ResponseEntity<Integer> createSubsequenceCalculation(@RequestBody InputStrings inputStrings){
        return new ResponseEntity<Integer>(taskService.CalculateSubsequence(inputStrings), HttpStatus.OK);
    }
}
