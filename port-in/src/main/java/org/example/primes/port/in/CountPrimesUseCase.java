package org.example.primes.port.in;

import org.example.primes.port.in.command.CountPrimes;
import org.example.primes.port.in.event.PrimesCounted;

public interface CountPrimesUseCase {
    PrimesCounted count(CountPrimes countPrimes);
}
