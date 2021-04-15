package org.example.primes.port.in.event;

import lombok.Value;
import org.example.primes.port.in.util.validation.Range;

@Value(staticConstructor = "of")
public class PrimesCounted implements Range {
    long from;
    long to;
    long count;
}
