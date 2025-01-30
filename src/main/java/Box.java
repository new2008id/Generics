import java.io.Serializable;
import java.util.List;

public class Box<T extends Number & Comparable<T> & Serializable> {
    private T[] array;

    public Box(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

//    public static void method(List<Number> numbers) {
//
//    }

    public static <U> U getFirstElement(List<U> list) { // <U> - параметрировазированный тип метода, U - возвращаемый тип метода
        return list.getFirst();
    }

    public static <U> void transfer(List<? extends U> src, List<? super U> dst) {
        dst.addAll(src);
        src.clear();
    }

    public static void method(List<? extends Number> numbers) {

    }

    public int compare(Box<?> another) {
        if (average() > another.average()) {
            return 1;
        } else if (average() == another.average()) {
            return 0;
        } else {
            return -1;
        }
    }

    public double average() {
        double result = 0;
        for (T element : array) {
            result += ((Number) element).doubleValue();
        }
        return result / array.length;
    }
}

//public class Box<T> {
//    private T object;
//
//    public Box(T object) {
//        this.object = object;
//    }
//
//    public T getObject() {
//        return object;
//    }
//
//    public void setObject(T object) {
//        this.object = object;
//    }
//}

//public class Box<K, V, F> {
//    private K key;
//    private V value;
//    private F floatValue;
//
//    public Box(K key, V value, F floatValue) {
//        this.key = key;
//        this.value = value;
//        this.floatValue = floatValue;
//    }
//
//    public K getKey() {
//        return key;
//    }
//
//    public void setKey(K key) {
//        this.key = key;
//    }
//
//    public V getValue() {
//        return value;
//    }
//
//    public void setValue(V value) {
//        this.value = value;
//    }
//
//    public F getFloatValue() {
//        return floatValue;
//    }
//
//    public void setFloatValue(F floatValue) {
//        this.floatValue = floatValue;
//    }
//}