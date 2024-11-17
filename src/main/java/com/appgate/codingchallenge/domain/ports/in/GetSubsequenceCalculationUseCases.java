package com.appgate.codingchallenge.domain.ports.in;

import com.appgate.codingchallenge.domain.models.InputStrings;

public interface GetSubsequenceCalculationUseCases {
    Integer CalculateSubsequence(InputStrings inputStrings);
}
