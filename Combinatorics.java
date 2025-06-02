import java.util.ArrayList;
public class Combinatorics {
    private ArrayList<Integer> fibonacciList;

    public Combinatorics() {
        fibonacciList = new ArrayList<Integer>();
    }
    
    // finds the nth term of a Fibonacci Sequence recursively
    public int fibonacci(int n) {
        int first = 0;
        int second = 1;
        System.out.println("Term 0 of the Fibonacci sequence is 0.");
        fibonacciList.add(first);
        for (int i = 0; i < n; i++) {
            fibonacciList.add(second);
            int temp = second;
            second = second + first;
            first = temp;
            System.out.println("Term " + (i + 1) + " of the Fibonacci sequence is " + first + ".");
        }
        return fibonacciList.get(n);
    }

    public int noPrintFibonacci(int n) {
        int first = 0;
        int second = 1;
        fibonacciList.add(first);
        for (int i = 0; i < n; i++) {
            fibonacciList.add(second);
            int temp = second;
            second = second + first;
            first = temp;
        }
        return fibonacciList.get(n);
    }
    /* see whether or not a number is a Fibonacci number
    disclaimer Integer.MAX_VALUE is 2147483647, so the terms of the Fibonacci Sequence can only go so far */
    public boolean isThereTerm(int num) {
        int i = 0;
        while (noPrintFibonacci(i) < num) {
            i++;
        }
        for (int x = 0; x < fibonacciList.size(); x++) {
            if (fibonacciList.get(x) == num) return true;
        }
        return false;
    }

    public int hockeyStickIdentity(int r, int n) {
        int count = 0;
        for (int i = r; i <= n; i++) {
            System.out.println(i + " choose " + r + " is " + BetterMath.combination(i, r));
            count += BetterMath.combination(i, r);
        }
        return count;
    }
}