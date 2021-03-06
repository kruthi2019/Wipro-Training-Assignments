/**
 * Given a string of even length, return the first half. So the string "CatDog" yields "Cat". 
 * If the string length is odd number then return null.
 */
import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(firstHalf(str));
    }

    static String firstHalf(String s) {
        int l = s.length();

        if((l & 1) == 1)
            return null;
        else
            return s.substring(0, l/2);
    }
}