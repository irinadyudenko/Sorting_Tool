package sorting;

import java.util.Comparator;

abstract class CountedComparator<T> implements Comparator<CountedElement<T>>{
    abstract public int compare(CountedElement<T> first, CountedElement<T> second);
}
