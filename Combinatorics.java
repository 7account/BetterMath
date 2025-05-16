import java.util.ArrayList;
public class Combinatorics {
    private ArrayList<Integer> fibonacciList;
    // finds the nth term of a Fibonacci Sequence recursively
    public Combinatorics() {
        fibonacciList = new ArrayList<Integer>();
    }
    
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

    //disclaimer Integer.MAX_VALUE is 2147483647, so the terms of the Fibonacci Sequence can only go so far
    public boolean isThereTerm(int num) {
        int i = 0;
        while (fibonacci(i) < num) {
            i++;
        }
        for (int x = 0; x < fibonacciList.size(); x++) {
            if (fibonacciList.get(x) == num) return true;
        }
        return false;
    }
}