import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> box1 = new ArrayList<Double>();
        ArrayList<Double> box2 = new ArrayList<Double>();
        final int DIM = 3;
        for (int i = 0; i < DIM; i++) {
            box1.add(scanner.nextDouble());
        }
        for (int i = 0; i < DIM; i++) {
            box2.add(scanner.nextDouble());
        }
        Collections.sort(box1);
        Collections.sort(box2);
        boolean b1IsBigger = true;
        boolean b2IsBigger = true;
        for (int i = 0; i < DIM; i++) {
            if (box1.get(i) <= box2.get(i)) {
                b1IsBigger = false;
            }
            if (box2.get(i) <= box1.get(i)) {
                b2IsBigger = false;
            }
        }
        if (b1IsBigger) {
            System.out.println("Box 1 > Box 2");
        }
        else if (b2IsBigger) {
            System.out.println("Box 1 < Box 2");
        }
        else {
            System.out.println("Incompatible");
        }
    }
}
