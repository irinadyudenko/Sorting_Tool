package sorting;

import java.util.ArrayList;

public class SortingCountedStrings extends SortingCount<String>{
    @Override
    public void sort() {
        this.setValueCountMap();
        valueCountMap.forEach((string, count) -> arrayListOfCountedElements.add(new CountedElement<String>(string, count)));
        arrayListOfCountedElements.sort(new CountedStringComparator());
    }
}
