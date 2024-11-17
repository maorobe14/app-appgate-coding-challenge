package com.appgate.codingchallenge.domain.ports.out;

import com.appgate.codingchallenge.domain.models.InputStrings;

import java.util.concurrent.CompletableFuture;

public interface DynamicSubsequencesCalculatorPort {
   CompletableFuture<Integer> CalculateSubsequence(InputStrings inputStrings);
}
