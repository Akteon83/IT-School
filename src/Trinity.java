import java.util.Arrays;

public class Trinity<T extends Comparable> {
    private T first;
    private T second;
    private T third;

    public Trinity(T a, T b, T c) {
        // Пришлось побить старушку, чтобы сделать массив T
        T[] array = (T[]) new Comparable[] { a, b, c };
        Arrays.sort(array);
        first = array[2];
        second = array[1];
        third = array[0];
    }

    public void setFirst(T first) {
        T[] array = (T[]) new Comparable[] { first, second, third };
        Arrays.sort(array);
        this.first = array[2];
        second = array[1];
        third = array[0];
    }

    public void setSecond(T second) {
        T[] array = (T[]) new Comparable[] { first, second, third };
        Arrays.sort(array);
        first = array[2];
        this.second = array[1];
        third = array[0];
    }

    public void setThird(T third) {
        T[] array = (T[]) new Comparable[] { first, second, third };
        Arrays.sort(array);
        first = array[2];
        second = array[1];
        this.third = array[0];
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }
}
