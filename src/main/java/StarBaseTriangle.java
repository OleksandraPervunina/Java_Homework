/**
 * Write a program called StarBaseTriangle that displays a triangle with ‘n’ star base. for example per n=5 triangle pattern should look like:
 *
 **
 ***
 ****
 *****
 */
public class StarBaseTriangle {

        public static void main(String[] args)
        {

            for (int i = 0; i <= 5; i++)
            {
                for (int j = 0; j != i; j++)
                    System.out.print("*");
                System.out.println();

            }
        }
    }

