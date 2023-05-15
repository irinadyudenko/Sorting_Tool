package sorting;

public class SortingNaturalStringWords extends SortingNaturalString {
    @Override
    public String toString() {
        String outputString = "Total numbers: " + this.arrayList.toArray().length + ".\n";
        String arrayAsString = this.arrayList.toString().replaceAll(",", "");
        outputString = outputString + "Sorted data: " + arrayAsString.substring(1, arrayAsString.length() - 1);
        return outputString;
    }
}
