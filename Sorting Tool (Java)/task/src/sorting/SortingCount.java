package sorting;

import java.util.*;

public abstract class SortingCount<T> extends Sorting<T>{

    Map<T, Integer> valueCountMap = new TreeMap<>();
    ArrayList<CountedElement<T>> arrayListOfCountedElements = new ArrayList<>();

    void setValueCountMap() {
        for (T value: this.arrayList) {
            if(valueCountMap.get(value) == null) {
                valueCountMap.put(value, 1);
            }
            else {
                int count = valueCountMap.get(value) + 1;
                valueCountMap.replace(value, count);
            }
        }
    }






}
