public class ProblemTwo {

    public static void main(String[] args) {

        int first = 1;
        int second = 2;
        long[] Total = new long[100000];
        Total[0] = first;
        Total[1] = second;
        System.out.print(first + ", " + second + ", ");

        for (int i = 2; i < 40; i++) {
            Total[i] = Total[i - 1] + Total[i - 2];
            System.out.print(Total[i] + ", ");
            
            if(Total[i]>=4000000){
                break;
            }
        }

        System.out.println("\n" + arrayTotal(Total));
    }

    public static long arrayTotal(long[] xs) {
        long total = 0;
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] % 2 == 0) {
                total = total + xs[i];
            } else {
                continue;
            }
        }
        return total;
    }

}
