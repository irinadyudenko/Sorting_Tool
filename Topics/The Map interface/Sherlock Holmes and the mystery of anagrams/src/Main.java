import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.next().toLowerCase();
        String secondString = scanner.next().toLowerCase();
        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();
        Set<Character> firstSet = new HashSet<>();
        Set<Character> secondSet = new HashSet<>();
        for (char letter: firstString.toCharArray()) {
            firstSet.add(letter);
        }
        for (char letter: secondString.toCharArray()) {
            secondSet.add(letter);
        }
        for (Character element: firstSet) {
            int total = 0;
            for (char letter : firstString.toCharArray()) {
                if (element.equals(letter)) {
                    total++;
                }
            }
            firstMap.put(element, total);
        }
        for (Character element: secondSet) {
            int total = 0;
            for (char letter : secondString.toCharArray()) {
                if (element.equals(letter)) {
                    total++;
                }
            }
            secondMap.put(element, total);
        }
        System.out.println(firstMap.equals(secondMap)? "yes" : "no");
    }
}