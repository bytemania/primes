package org.example.primes.port.in.util.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RangeCheckValidator implements ConstraintValidator<RangeCheck, Range> {
    @Override
    public boolean isValid(Range range, ConstraintValidatorContext constraintValidatorContext) {
        return range.getFrom() <= range.getTo();
    }
}
