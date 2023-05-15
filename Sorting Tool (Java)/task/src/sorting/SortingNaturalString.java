package sorting;

import java.util.Collections;

public class SortingNaturalString extends Sorting<String>{
    @Override
    public void sort() {
        Collections.sort(this.arrayList);
    }
}
