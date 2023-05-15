package sorting;

public class SortingCountedLines extends SortingCountedStrings{
    @Override
    public String toString() {
        int total = this.arrayList.toArray().length;
        String outputString = "Total lines: " + total + ".\n";
        for (CountedElement<String> element : arrayListOfCountedElements) {
            outputString = outputString +
                    element.element + ": " + element.count + " time(s), " + element.count*100/total + "%\n";
        }
        return outputString;
    }
}
