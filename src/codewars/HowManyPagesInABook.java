package codewars;
public class HowManyPagesInABook {

    /**
     * @link https://www.codewars.com/kata/622de76d28bf330057cd6af8/train/java
     * @author Marc
     * @param summary the number made by adding up the number of digits of all page numbers.
     * @return the number of pages n the book has.
     */
    public static int amountOfPages(int summary) {
//        My original attempt. The last test fails. Times out using String.
//        String digits = "";
//        int n = 0;
//        while (true) {
//            digits += ++n + "";
//            if (digits.length() >= summary) {
//                break;
//            }
//        }
//        return n;

        int digitsLength = 0;
        int n = 0;
        while(true) {
            // https://stackoverflow.com/questions/1306727/way-to-get-number-of-digits-in-an-int
            int numDigits = (int)(Math.log10(++n)+1);
            digitsLength += numDigits;
            if(digitsLength >= summary) {
                break;
            }
        }
        return n;
    }


}