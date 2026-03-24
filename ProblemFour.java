public class ProblemFour {
    public static void main(String[] args) {
        int largestPal = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                int product = i * j;
                System.out.println(i + " * " + j + " = " + product);
                boolean isPal = palCheck(product);



                if (isPal == true&&largestPal<product) {
                    largestPal = product;
                    System.out.println("New Palindrome set " + largestPal);
                }
            }
        }

        System.out.println(largestPal);
    }

    public static boolean palCheck(int number) {
        String str1 = Integer.toString(number);
        String[] myArray = str1.split("");
        int lastPlace = myArray.length - 1;
        boolean pal = false;
        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i].equals(myArray[lastPlace - i])) {
                System.out.println("Checking " + myArray[i] + " with " + myArray[lastPlace]);
                pal = true;
            } else {
                return false;
            }

        }
        return pal;
    }
}
