import java.util.ArrayList;
public class NumberTheory {
    private ArrayList<Integer> factorList;
    
    public NumberTheory() {
        factorList = new ArrayList<Integer>();
    }

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

    public boolean isPrime(int x) {
        
    }
}