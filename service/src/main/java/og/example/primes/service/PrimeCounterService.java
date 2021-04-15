package og.example.primes.service;

import org.example.primes.port.in.CountPrimesUseCase;
import org.example.primes.port.in.command.CountPrimes;
import org.example.primes.port.in.event.PrimesCounted;

public class PrimeCounterService implements CountPrimesUseCase {

    @Override
    public PrimesCounted count(CountPrimes countPrimes) {
        //Check database cache

        //if fails call the calculator//

        //update cache

        return PrimesCounted.of(0, 1, 0);
    }
}
