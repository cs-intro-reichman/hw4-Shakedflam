public class Primes {
    public static void main(String[] args) {
        int untilWhatNumber= Integer.parseInt(args[0]);
        boolean[] isPrime= new boolean[untilWhatNumber+1];
        for (int i=2; i<isPrime.length; i++){
            isPrime[i]=true;
        }
        int prime=2;
        while (prime*prime<=untilWhatNumber){
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
        int howManyPrimes=0;
        for (int j=2; j<isPrime.length; j++){
            if (isPrime[j]==true){
                howManyPrimes++;
            }
        }
        System.out.println("There are " + howManyPrimes + " primes between 2 and " + untilWhatNumber + " (" + ((howManyPrimes * 100) / untilWhatNumber) + "% are primes)");
    }
}