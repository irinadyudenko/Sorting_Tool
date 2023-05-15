package sorting;

public class SortingNaturalStringLines extends SortingNaturalString {

    @Override
    public String toString() {
        String outputString = "Total lines: " + this.arrayList.toArray().length + ".\n";
        String arrayAsString = this.arrayList.toString().replaceAll(", ", "\n");
        outputString = outputString + "Sorted data:\n" + arrayAsString.substring(1, arrayAsString.length() - 1);
        return outputString;
    }
}
