package com.appgate.codingchallenge.application.usecases;

import com.appgate.codingchallenge.domain.models.InputStrings;
import com.appgate.codingchallenge.domain.ports.in.GetSubsequenceCalculationUseCases;
import com.appgate.codingchallenge.domain.ports.out.DynamicSubsequencesCalculatorPort;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class GetSubsequenceCalculationUseCasesImpl implements GetSubsequenceCalculationUseCases {

    private final DynamicSubsequencesCalculatorPort dynamicSubsequencesCalculatorPort;

    public GetSubsequenceCalculationUseCasesImpl(DynamicSubsequencesCalculatorPort dynamicSubsequencesCalculatorPort) {
        this.dynamicSubsequencesCalculatorPort = dynamicSubsequencesCalculatorPort;
    }

    
    @Override
    public Integer CalculateSubsequence(InputStrings inputStrings) {
        return dynamicSubsequencesCalculatorPort.CalculateSubsequence(inputStrings);
    }
}
