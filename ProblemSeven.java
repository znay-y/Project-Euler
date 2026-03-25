public class ProblemSeven {
    public static void main(String[] args) {
        int[] foundPrimes = new int[0];
        boolean isPrime = false;

        for (int i = 2; i < 150000; i++) {

            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0 || i % 11 == 0) {
                continue;
            }
            // Loops to check prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(i + " failed at " + j);
                    System.out.println(i + " is not Prime");
                    isPrime = false;
                    break;

                } else if (j % 2 == 0 || j % 3 == 0 || j % 5 == 0 || j % 7 == 0 || j % 11 == 0) {
                    continue;
                } else {
                    isPrime = true;
                }
            }

            if (isPrime == true) {
                foundPrimes = intArrayAppend(foundPrimes, i);
                System.out.println(i + " added to array of primes");
            } else {
                continue;
            }
        }

        printAray(foundPrimes);
    }

    public static void printAray(int[] iArray) {
        for (int i = 0; i < 10005; i++) {
            System.out.println("Prime "+(i+1)+" is "+iArray[i]);
        }
    }

    public static int[] intArrayAppend(int[] iArray, int toAdd) {
        int[] newfoundPrimes = new int[iArray.length + 1];

        for (int j = 0; j < iArray.length; j++) {
            newfoundPrimes[j] = iArray[j];
        }
        newfoundPrimes[iArray.length] = toAdd;

        return newfoundPrimes;
    }
}
