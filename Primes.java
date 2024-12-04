public class Primes {
    public static void main(String[] args) {
        final int untilWhatNumber = Integer.parseInt(args[0]);
        boolean [] isPrime = new boolean[untilWhatNumber + 1];
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        int prime = 2;
        while (prime * prime <= untilWhatNumber) {
            if (isPrime[prime]) {
                int multiple = prime * prime;
                while (multiple <= untilWhatNumber) {
                    isPrime[multiple] = false;
                    multiple += prime;
                }
            }
            prime++;
        }
        System.out.println("Prime numbers up to " + untilWhatNumber + ":");
        int primeCounter = 0;;
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i] == true) {
                System.out.println(i);
                primeCounter++;
            }
        }
        System.out.println("There are " + primeCounter + " primes between 2 and " + untilWhatNumber + " (" + ((primeCounter * 100) / untilWhatNumber) + "% are primes)");


    }
}