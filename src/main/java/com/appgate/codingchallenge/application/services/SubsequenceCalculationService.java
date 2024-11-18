package com.appgate.codingchallenge.application.services;

import com.appgate.codingchallenge.domain.models.InputStrings;
import com.appgate.codingchallenge.domain.ports.in.GetSubsequenceCalculationUseCases;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class SubsequenceCalculationService implements GetSubsequenceCalculationUseCases {

    private final GetSubsequenceCalculationUseCases getSubsequenceCalculationUseCases;

    public SubsequenceCalculationService(GetSubsequenceCalculationUseCases getSubsequenceCalculationUseCases) {
        this.getSubsequenceCalculationUseCases = getSubsequenceCalculationUseCases;
    }

    @Override
    public CompletableFuture<Integer> CalculateSubsequence(InputStrings inputStrings) {
        return getSubsequenceCalculationUseCases.CalculateSubsequence(inputStrings);
    }
}
