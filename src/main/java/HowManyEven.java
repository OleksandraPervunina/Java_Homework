import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a program called HowManyEven which prints how many even digits number n has (Assumption: n>0).
 For example - per given 254698 number the program should print 4
 */
public class HowManyEven {

    public static void main(String[] args) {
        int i = 254698;
        int counter = 0;

        while (i > 0) {
            int digit = i % 10;
            if (digit % 2 == 0) {
                counter++;
            }
            i = i / 10;
        }

      System.out.print(counter);
    }
}


