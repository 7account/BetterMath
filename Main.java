public class Main {
    public static void main(String[] args) {
        //BetterMath test cases:
        System.out.println(BetterMath.abs(-1));
        System.out.println(BetterMath.abs(1.0));
        System.out.println(BetterMath.pow(2.0, 4.0));
        System.out.println(BetterMath.sqrt(-2));
        System.out.println(BetterMath.sqrt(4));
        System.out.println(BetterMath.sqrt(2));
        System.out.println(BetterMath.ceil(-2.6));
        System.out.println(BetterMath.floor(-2.6));
        System.out.println(BetterMath.round(-2.6));
        System.out.println(BetterMath.min(-2.6, -2.7));
        System.out.println(BetterMath.min(0, 2));
        System.out.println(BetterMath.max(-2.6, -2.7));
        System.out.println(BetterMath.max(0, 2));
        System.out.println(BetterMath.permutation(9, 2));
        System.out.println(BetterMath.combination(6, 4));
        System.out.println("--------------------------------------------");

        //NumberTheory test cases:
        NumberTheory NumberTheory1 = new NumberTheory();
        System.out.println(NumberTheory1.fermatPrime(2, 800));
        System.out.println(NumberTheory1.pseudoprime());
        NumberTheory NumberTheory2 = new NumberTheory();
        System.out.println(NumberTheory2.euclidianAlgorithm(84, 36));
        System.out.println(NumberTheory.isPrime(31));
        System.out.println("--------------------------------------------");

        //Combinatorics test cases:
        Combinatorics Combinatorics1 = new Combinatorics();
        System.out.println(Combinatorics1.fibonacci(5));
        System.out.println(Combinatorics1.isThereTerm(5));
        System.out.println(Combinatorics1.hockeyStickIdentity(4, 9));
        System.out.println("--------------------------------------------");

        //GraphTheory test cases:
        GraphTheory GraphTheory1 = new GraphTheory();
        System.out.println(GraphTheory1.euclidian());
        int[] d = {2, 1, 4, 1};
        GraphTheory GraphTheory2 = new GraphTheory(4,4,d);
        System.out.println(GraphTheory2.euclidian());
    }
}