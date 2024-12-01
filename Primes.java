public class Primes {
    public static void main(String[] args) {
        int untilWhatNumber= Integer.parseInt(args[0]);
        int breakingPoint= (int)Math.sqrt(untilWhatNumber);
        boolean[] isPrimre= new boolean[untilWhatNumber+1];
        for (int i=2; i<isPrimre.length; i++){
            isPrimre[i]=true;
        }
        int prime=2;
        while (prime<=breakingPoint+1){
            for (int j=prime+1; j<isPrimre.length; j++){
                if (j%prime==0 ){
                    isPrimre[j]=false;
                }
            }
            for (int k=prime+1; k<untilWhatNumber; k++){
                if (isPrimre[k]==true){
                    prime=k;
                    break;
                }
            }
        }
        int howManyPrimes=0;
        for (int j=2; j<isPrimre.length; j++){
            if (isPrimre[j]==true){
                howManyPrimes++;
            }
        }
        System.out.println("Prime numbers up to "+untilWhatNumber+":");
        System.out.println("There are "+howManyPrimes+" primes between 2 and "+untilWhatNumber+" ("+((howManyPrimes*100)/untilWhatNumber)+"% are primes)");
    }
}