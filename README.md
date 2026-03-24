Project-Euler
=============

Java Solutions for project Euler
--------------------------------

### Problem Zero

Finding the sum of all odd square numbers up to 520,000

* * *

Steps to solving:

*   Create a long java type
*   Use a for loop to find sqare numbers from 1 to 520,000
*   Check if square nunmber is even or odd
*   Add to total and print

### Problem One

Sum all multiples of 3 and 5 below 1000

* * *

Steps to solving:

*   Init total and for loop up to 1000
*   Check if multiples of 3 OR 5
*   Outputs the new multiple that was found and the new total
*   Returns final total

### Problem Two

Find the sum of Fibonacci sequence numbers until 4,000,000

* * *

Steps to solving:

*   Array created to store the
*   Use a for loop to find sqare numbers from 1 to 520,000
*   Check if square nunmber is even or odd
*   Add to total and print

### Problem Four

Find the largest palindrome number for the product of 3 digit numbers

* * *

Steps to solving:

*   Init 2 for loops to multiple every combination of numbers
*   Check each one in another method returning boolean
*   Other method converts to char array and checks for palindrome
*   This is done by searching array index from beginning and end coming inwards
```
for (int i = 0; i < myArray.length; i++) {

            if (myArray[i].equals(myArray[lastPlace - i])) {
                System.out.println("Checking " + myArray[i] + " with " + myArray[lastPlace]);
                pal = true;
            } else {
                return false;
            }

        }
```


### Problem Five

Find the smallest number that divides perectly with numbers 1 to 20

* * *

Steps to solving:

*   Init 2 for loops to multiple every combination of numbers
*   Check each one in another method returning boolean
*   Other method converts to char array and checks for palindrome
*   This is done by searching array index from beginning and end coming inwards

