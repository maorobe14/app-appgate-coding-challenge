package com.appgate.codingchallenge.application.services;

import com.appgate.codingchallenge.domain.models.InputStrings;
import com.appgate.codingchallenge.domain.ports.in.GetSubsequenceCalculationUseCases;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements GetSubsequenceCalculationUseCases {

    private final GetSubsequenceCalculationUseCases getSubsequenceCalculationUseCases;

    public TaskService(GetSubsequenceCalculationUseCases getSubsequenceCalculationUseCases) {
        this.getSubsequenceCalculationUseCases = getSubsequenceCalculationUseCases;
    }

    @Override
    public Integer CalculateSubsequence(InputStrings inputStrings) {
        return getSubsequenceCalculationUseCases.CalculateSubsequence(inputStrings);
    }
}
