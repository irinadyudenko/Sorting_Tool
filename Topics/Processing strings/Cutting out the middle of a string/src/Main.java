import java.awt.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        char[] strChars = inputStr.toCharArray();
        int newLength = strChars.length-2+strChars.length%2;
        char[] outStrChars = new char[newLength];
        for (int i = 0; i < newLength/2; i++) {
            outStrChars[i] = strChars[i];
            outStrChars[newLength-i-1] = strChars[strChars.length - i -1];
        }
        System.out.println(String.valueOf(outStrChars));
    }
}