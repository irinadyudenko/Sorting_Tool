package sorting;

public class CountedElement<T> {
    T element;
    int count;
    int percentage;
    public CountedElement(T element, int count) {
        this.element = element;
        this.count = count;
    }

    public CountedElement(T element, int count, int percentage) {
        this.element = element;
        this.count = count;
        this.percentage = percentage;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public int getCount() {
        return count;
    }
    public int getPercentage() {
        return this.percentage;
    }

}
