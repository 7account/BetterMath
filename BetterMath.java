public class BetterMath {
    public static int abs(int num) { 
        if (num < 0) return -(num);
        return num;
    }

    public static double abs(double num) { 
        if (num < 0.0) return -(num);
        return num;
    }

    public static double pow(double base, double exponent) {
        double count = 1.0;
        for (int i = 0; i < exponent; i++) {
            count *= base;
        }
        return count;
    }

    /* uses Heron's method to find square root by hand ->
    guess a number and iterate to polish numbers; each repetition fine-tunes towards the correct number */
    public static double sqrt(double x) {
        if (x < 0) return Double.NaN;
        if (x == 0.0) return 0.0;
        double result = 2.0;
        for (int i = 0; i < 30; i++) {
            result = (result + (x / result)) / 2.0;
        }
        return result;
    }

    public static double ceil(double x) {
        int num = ((int) x) + 1;
        if (x < 0) num = (int) x;
        return (double) num;
    }

    public static double floor(double x) {
        int num = (int) x;
        if (num < 0) num = (int) x - 1;
        return (double) num;
    }

    public static double round(double x) {
        if ((int) x * 2 == (int) (2 * x)) return floor(x);
        return ceil(x);
    }

    public static int min(int x, int y) {
        if (x < y) return x;
        return y;
    }

    public static int max(int x, int y) {
        if (x > y) return x;
        return y;
    }

    public static double min(double x, double y) {
        if (x < y) return x;
        return y;
    }

    public static double max(double x, double y) {
        if (x > y) return x;
        return y;
    }

    public static int factorial(int x) {
        int count = 1;
        for(int i = 1; i <= x; i++) {
            count *= i;
        }
        return count;
    }

    public static int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}