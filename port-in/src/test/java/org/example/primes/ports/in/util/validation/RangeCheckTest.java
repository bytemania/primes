package org.example.primes.ports.in.util.validation;

import lombok.Getter;
import org.example.primes.port.in.util.validation.Range;
import org.example.primes.port.in.util.validation.RangeCheck;
import org.example.primes.port.in.util.validation.SelfValidating;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolationException;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class RangeCheckTest {

    @RangeCheck
    @Getter
    private static class ClassToBeValidated extends SelfValidating<ClassToBeValidated> implements Range {
        private final long from;
        private final long to;

        public ClassToBeValidated(long from, long to) {
            this.from = from;
            this.to = to;
            validateSelf();
        }
    }

    @Test
    @DisplayName("A valid range must be valid")
    void aValidRangeMustBeValid() {
        new ClassToBeValidated(1, 10);
    }

    @Test
    @DisplayName("A valid range (single value) must be valid")
    void aValidRangeSingleValueMustBeValid() {
        new ClassToBeValidated(1, 1);
    }

    @Test
    @DisplayName("A invalid range must fail")
    void aInValidRangeMustFail() {
        assertThatExceptionOfType(ConstraintViolationException.class)
                .isThrownBy(() -> new ClassToBeValidated(10, 1))
                .withMessage(": Not a valid range")
                .withNoCause();
    }

}
