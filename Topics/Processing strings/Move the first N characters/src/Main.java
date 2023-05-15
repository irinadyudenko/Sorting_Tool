import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        int n = scanner.nextInt();
        String subStrBeg = inputStr.substring(0, n < inputStr.length() ? n : inputStr.length());
        String subStrEnd = n < inputStr.length() ? inputStr.substring(n, inputStr.length()) : "";
        System.out.println(subStrEnd + subStrBeg);
    }
}