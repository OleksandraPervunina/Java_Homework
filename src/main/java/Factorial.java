/**
 * By using for loop write a program called Factorial which calculates n! and prints the result.
 */
public class Factorial {

        public static void main(String[] args) {
            int n = 0;
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            System.out.println("The factorial of " + n + " is " + result);

        }
    }


