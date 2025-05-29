import java.util.ArrayList;
public class NumberTheory {
    private ArrayList<Integer> factorList;
    private ArrayList<Integer> fermatPrimeList;
    
    public NumberTheory() {
        factorList = new ArrayList<Integer>();
        fermatPrimeList = new ArrayList<Integer>();
    }

    //with euclidian algorithm, the user can find the greatest common factor between two numbers easily
    public int euclidianAlgorithm(int num1, int num2) {
        if (num1 == 0) return num2;
        if (num2 == 0) return num1;
        if (num2 > num1) {
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }
        int a = num1;
        int b = num2;
        int q = (a / b);
        int r = a - (q * b);
        a = b;
        b = r;
        while (r != 0) {
            q = (a / b);
            r = a - (q * b);
            a = b;
            b = r;
        }
        return a;
    }

    /* brute force for factors and see if it is prime or composite
    prime: there are only two factors (1 and itself)
    composite: more than two factors
    */
    public ArrayList<Integer> primeOrComposite(int x) {
        int valueBruteForce = x;
        while (valueBruteForce != 0) {
            if (x % valueBruteForce == 0) factorList.add(valueBruteForce);
            valueBruteForce--;
        }
        if (factorList.size() == 2) System.out.println(x + " is a prime number!");
        else System.out.println(x + " is a composite number!");
        return factorList;
    }

    /* use Fermat's Little Theorem to find primes
    However, Fermat's Little Theorem doesn't always give primes; there are pseudoprimes
    */
    public ArrayList<Integer> fermatPrime(int low, int high) {
        for (int p = low; p <= high; p++) {
            if (BetterMath.pow(2, p - 1) % p == 1) fermatPrimeList.add(p);
        }
        return fermatPrimeList;
    }

    /* find pseudoprimes from the the list of primes from Fermat's Little Theorem
    with each "prime," we bruteforce numbers to see if it is prime or composite them
    */
    public ArrayList<Integer> pseudoprime() {
        ArrayList<Integer> pseudoPrimeList = new ArrayList<Integer>();
        for (int i = 0; i < fermatPrimeList.size(); i++) {
            if (primeOrComposite(fermatPrimeList.get(i)).size() == 2) pseudoPrimeList.add(fermatPrimeList.get(i));
        }
        if (pseudoPrimeList.size() == 0) System.out.println("There are no pseudoprimes!");
        else System.out.println("There are pseudoprimes!");
        return pseudoPrimeList;
    }
}