package org.example.primes.port.in.command;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.example.primes.port.in.util.validation.Range;
import org.example.primes.port.in.util.validation.RangeCheck;
import org.example.primes.port.in.util.validation.SelfValidating;

import javax.validation.constraints.Min;

@Getter
@EqualsAndHashCode(callSuper = false)
@RangeCheck
public class CountPrimes extends SelfValidating<CountPrimes> implements Range {
    public static CountPrimes of(long from, long to) {
        return new CountPrimes(from, to);
    }

    @Min(1)
    private final long from;
    @Min(1)
    private final long to;

    private CountPrimes(long from, long to) {
        this.from = from;
        this.to = to;
        validateSelf();
    }
}
