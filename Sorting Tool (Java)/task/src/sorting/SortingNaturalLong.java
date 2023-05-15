package sorting;

import java.util.Collections;
import java.util.Comparator;

public class SortingNaturalLong extends Sorting<Long> {
    @Override
    public void sort() {
        Collections.sort(this.arrayList, new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return (int) (o1-o2);
            }
        });
    }

    @Override
    public String toString() {
        String outputString = "Total numbers: " + this.arrayList.toArray().length + ".\n";
        String arrayAsString = this.arrayList.toString().replaceAll(",", "");
        outputString = outputString + "Sorted data: " + arrayAsString.substring(1, arrayAsString.length() - 1);
        return outputString;
    }
}
