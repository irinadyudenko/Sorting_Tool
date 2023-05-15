package sorting;

import java.util.ArrayList;

public class SortingCountedLongs extends SortingCount<Long>{
    @Override
    public void sort() {
        this.setValueCountMap();
        this.arrayListOfCountedElements = new ArrayList<>();
        valueCountMap.forEach((string, count) -> this.arrayListOfCountedElements.add(new CountedElement<Long>(string, count)));
        this.arrayListOfCountedElements.sort(new CountedLongComparator());
    }

    @Override
    public String toString() {
        int total = this.arrayList.toArray().length;
        String outputString = "Total numbers: " + total + ".\n";
        for (CountedElement<Long> element : this.arrayListOfCountedElements) {
            outputString = outputString +
                    element.element + ": " + element.count + " time(s), " + element.count*100/total + "%\n";
        }
        return outputString;
    }

}
