import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        boolean isNeverNeighbours = true;
        for (int i = 0; i < arraySize-1; i ++) {
            if ((array[i] == m && array[i+1] == n) || (array[i] == n && array[i+1] == m)) {
                isNeverNeighbours = false;
                break;
            }
        }
        System.out.println(isNeverNeighbours);
    }
}