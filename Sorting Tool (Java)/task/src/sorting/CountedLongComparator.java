package sorting;

import java.util.Comparator;

class CountedLongComparator implements Comparator<CountedElement<Long>> {
    @Override
    public int compare(CountedElement<Long> first, CountedElement<Long> second) {
        if (first.count > second.count) {
            return 1;
        } else if (first.count < second.count) {
            return -1;
        } else {
            return first.element.compareTo(second.element);
        }
    }
}

