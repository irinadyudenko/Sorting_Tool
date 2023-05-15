import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ro = scanner.nextDouble();
        double g = 9.8;
        double h = scanner.nextDouble();
        System.out.println(ro * g * h);
        // put your code here
    }
}