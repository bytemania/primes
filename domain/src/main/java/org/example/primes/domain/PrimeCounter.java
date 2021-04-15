package org.example.primes.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.stream.LongStream;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PrimeCounter {

    public static long count(long from, long to) {
        return LongStream.rangeClosed(from, to)
                .parallel()
                .filter(PrimeCounter::isPrime)
                .count();
    }

    private static boolean isPrime(long num) {
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
