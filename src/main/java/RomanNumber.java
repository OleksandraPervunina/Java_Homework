/**
 * Write a method that gets a number from 1-10 and return the roman number sign
 */
public class RomanNumber {

public static void main (String[] args) {

    int number = 5;
    String romanNumber;
    switch (number) {

        case 1:
            romanNumber = "I";
            break;
        case 2:
            romanNumber = "II";
            break;
        case 3:
            romanNumber = "III";
            break;
        case 4:
            romanNumber = "IV";
            break;
        case 5:
            romanNumber = "V";
            break;
        case 6:
            romanNumber = "VI";
            break;
        case 7:
            romanNumber = "VII";
            break;
        case 8:
            romanNumber = "VIII";
            break;
        case 9:
            romanNumber = "IX";
            break;
        case 10:
            romanNumber = "X";
            break;
        default:
            romanNumber = "Invalid number";
            break;
    }
    System.out.println(romanNumber);
}
}
