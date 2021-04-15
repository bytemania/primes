package org.example.primes.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrimeCounterTest {

    @Test
    @DisplayName("Should Calculate the primes for the base case")
    void shouldCalculateThePrimesForTheBaseCase() {
        assertThat(PrimeCounter.count(1, 1)).isZero();
    }

    @Test
    @DisplayName("Should Calculate the primes for a range starting from the base")
    void shouldCalculateThePrimesBetweenTwoNumbersStartingFromTheBase() {
        assertThat(PrimeCounter.count(1, 10)).isEqualTo(4);
    }

    @Test
    @DisplayName("Should Calculate the primes for a range")
    void shouldCalculateThePrimesBetweenTwoNumbers() {
        assertThat(PrimeCounter.count(5, 10)).isEqualTo(2);
    }
}