/**
 * Write a program called Misparim which prints the numbers 1 to 20 as follows:
 First row - all the numbers which are multiples of 2
 Second row - all the numbers which are multiples of 3
 Third row - all the numbers which are multiples of 4
 */
public class Misparim {

    public static void main(String[] args) throws Exception {

        for (int j = 2; j <= 20; j = j + 2) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int k = 3; k <= 20; k = k + 3) {
            System.out.print(k + " ");
        }
        System.out.println();

        for (int h = 4; h <= 20; h = h + 4) {
            System.out.print(h + " ");
        }

    }
}
