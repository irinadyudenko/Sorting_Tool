package sorting;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

class CountedStringComparator extends CountedComparator<String>{

    @Override
    public int compare(CountedElement<String> first, CountedElement<String> second) {
        if (first.count > second.count) {
            return 1;
        } else if (first.count < second.count) {
            return -1;
        } else {
            return first.element.compareTo(second.element);
        }
    }

}
