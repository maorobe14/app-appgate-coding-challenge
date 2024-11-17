package com.appgate.codingchallenge.infrastructure.adapters;

import com.appgate.codingchallenge.domain.models.InputStrings;
import com.appgate.codingchallenge.domain.ports.out.DynamicSubsequencesCalculatorPort;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class DynamicSubsequencesCalculatorAdapter implements DynamicSubsequencesCalculatorPort {

     @Override
    public CompletableFuture<Integer> CalculateSubsequence(InputStrings inputStrings) {

        String sourceSubsequences = inputStrings.getSourceSubsequences();
        String targetSubsequences = inputStrings.getTargetSubsequences();

        int sourceLengthSubsequences = sourceSubsequences.length();
        int targetLengthSubsequences = targetSubsequences.length();

        int[][] subsequencesArray = initializeSubsequenceArray(sourceLengthSubsequences, targetLengthSubsequences);

        // Rellenar la matriz con la lógica del problema
        for (int i = 1; i <= sourceLengthSubsequences; i++) {
            for (int j = 1; j <= targetLengthSubsequences; j++) {
                if (sourceSubsequences.charAt(i - 1) == targetSubsequences.charAt(j - 1)) {
                    subsequencesArray[i][j] = subsequencesArray[i - 1][j - 1] + subsequencesArray[i - 1][j];
                } else {
                    subsequencesArray[i][j] = subsequencesArray[i - 1][j];
                }
            }
        }

        return CompletableFuture.completedFuture(Integer.valueOf(subsequencesArray[sourceLengthSubsequences][targetLengthSubsequences]));
    }

    private int[][] initializeSubsequenceArray(int sourceLengthSubsequences, int targetLengthSubsequences) {
        int[][] subsequencesArray = new int[sourceLengthSubsequences + 1][targetLengthSubsequences + 1];
        for (int i = 0; i <= sourceLengthSubsequences; i++) subsequencesArray[i][0] = 1;
        return subsequencesArray;
    }
}
