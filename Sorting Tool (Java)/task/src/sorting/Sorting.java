package sorting;

import java.util.ArrayList;

public abstract class Sorting<T> {
    ArrayList<T> arrayList = new ArrayList<T>();
    public abstract void sort();

    void addElement(T element) {
        arrayList.add(element);
    }
}
