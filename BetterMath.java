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
        double count = 0.0;
        for (int i = 0; i < exponent; i++) {
            count *= exponent;
        }
        return count;
    }

    public static double sqrt(double x) {
        double close = 0;
        for (double i = 1; i <= x; i++) {
            if (pow(i, 2) < x && pow(i + 1, 2) > x) close = i;
        }
        return (close + (x / close)) / 0.5;
    }

    public static double ceil(double x) {
        int num = ((int) x) + 1;
        return (double) num;
    }

    public static double floor(double x) {
        int num = (int) x;
        return (double) num;
    }

    public static double round(double x) {
        
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