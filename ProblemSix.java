public class ProblemSix {
    public static void main(String[] args) {
        int SumSquare = 0;
        int SquareSum = 0;

        for (int i = 0; i <= 100; i++) {
            SumSquare = SumSquare + (i * i);
            SquareSum = SquareSum + i;
        }

        System.out.println("Sum of squares: " + SumSquare);
        System.out.println("Total before squaring: " + SquareSum);
        SquareSum = SquareSum * SquareSum;
        System.out.println("Squared total: " + SquareSum);
        int diffSum = SquareSum-SumSquare;
        System.out.println("Difference of sums: "+diffSum);

    }

}
