package com.appgate.codingchallenge.domain.ports.in;

import com.appgate.codingchallenge.domain.models.InputStrings;

import java.util.concurrent.CompletableFuture;

public interface GetSubsequenceCalculationUseCases {
    CompletableFuture<Integer> CalculateSubsequence(InputStrings inputStrings);
}
