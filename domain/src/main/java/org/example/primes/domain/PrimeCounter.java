package org.example.primes.domain;

import lombok.NoArgsConstructor;

import java.util.stream.LongStream;

@NoArgsConstructor(staticName = "of")
public class PrimeCounter {

    public long count(long from, long to) {
        return LongStream.rangeClosed(from, to)
                .parallel()
                .filter(this::isPrime)
                .count();
    }

    private boolean isPrime(long num) {
        if (num == 1)  {
            return false;
        }

        if (num == 2) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        long maxDivisor = (long) Math.sqrt(num);

        for (int i = 3; i <= maxDivisor ; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

}
