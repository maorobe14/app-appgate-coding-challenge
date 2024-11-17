package com.appgate.codingchallenge.domain.ports.out;

import com.appgate.codingchallenge.domain.models.InputStrings;

public interface DynamicSubsequencesCalculatorPort {
   Integer CalculateSubsequence(InputStrings inputStrings);
}
