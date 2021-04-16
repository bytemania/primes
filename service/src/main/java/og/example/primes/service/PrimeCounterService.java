package og.example.primes.service;

import lombok.RequiredArgsConstructor;
import org.example.primes.domain.PrimeCounter;
import org.example.primes.port.in.CountPrimesUseCase;
import org.example.primes.port.in.command.CountPrimes;
import org.example.primes.port.in.event.PrimesCounted;

@RequiredArgsConstructor
public class PrimeCounterService implements CountPrimesUseCase {

    private final PrimeCounter primeCounter;

    @Override
    public PrimesCounted count(CountPrimes countPrimes) {
        //Check database cache

        //if fails call the calculator//
        primeCounter.count(countPrimes.getFrom(), countPrimes.getTo());
        //update cache

        return PrimesCounted.of(0, 1, 0);
    }
}
