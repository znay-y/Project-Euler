public class ProblemZero {
    public static void main(String[] args) {
        long total=0;
        for(long i =0;i<=520000;i++){
            long square = i*i; 

            if (square%2==0){
                continue;
            }
            else{
                total = total +square;
                System.out.println("New total "+total);
            }
        }

        System.out.println(total);
    }
}
