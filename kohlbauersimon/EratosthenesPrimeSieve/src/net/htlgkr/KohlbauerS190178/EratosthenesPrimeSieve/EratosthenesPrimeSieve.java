package net.htlgkr.KohlbauerS190178.EratosthenesPrimeSieve;

public class EratosthenesPrimeSieve {

    int upperLimit;

    public EratosthenesPrimeSieve(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public boolean isPrime(int number) {

        if(number<=1)
        {
            return false;
        }
        for(int i=2;i<=number/2;i++)
        {
            if((number%i)==0)
                return  false;
        }
        return true;
    }

    public void printPrimes(){
        for(int i=0;i<upperLimit;i++){
            if(isPrime(i)){
                System.out.println(i+" is a prime");
            }
        }
    }

}
