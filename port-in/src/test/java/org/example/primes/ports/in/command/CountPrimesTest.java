package org.example.primes.ports.in.command;

import org.example.primes.port.in.command.CountPrimes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolationException;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class CountPrimesTest {

    @Test
    @DisplayName("A valid count primes should not fail")
    void validCountPrimes() {
        CountPrimes.of(1, 2);
    }

    @Test
    @DisplayName("A invalid count primes (0 from) should not fail")
    void invalidZeroFromCountPrimes() {
        assertThatExceptionOfType(ConstraintViolationException.class)
                .isThrownBy(() -> CountPrimes.of(0, 2))
                .withMessage("from: must be greater than or equal to 1")
                .withNoCause();
    }

    @Test
    @DisplayName("A invalid count primes (0 to) should fail")
    void invalidZeroToCountPrimes() {
        assertThatExceptionOfType(ConstraintViolationException.class)
                .isThrownBy(() -> CountPrimes.of(2, 0))
                .withMessage("to: must be greater than or equal to 1, : Not a valid range")
                .withNoCause();
    }

    @Test
    @DisplayName("A invalid range in count primes should fail")
    void invalidRangeCountPrimes() {
        assertThatExceptionOfType(ConstraintViolationException.class)
                .isThrownBy(() -> CountPrimes.of(10, 1))
                .withMessage(": Not a valid range")
                .withNoCause();
    }

}
