package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T> {

    private static final Object[] EMPTY_DATA = {};
    private static final int DEFAULT_CAPACITY = 10;

    private int capacity;
    private int size;
    private Object[] data;

    public MyArrayList() {
        this.data = EMPTY_DATA;
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.data = new Object[initialCapacity];
            capacity = initialCapacity;
        } else if (initialCapacity == 0) {
            this.data = EMPTY_DATA;
            capacity = 0;
        } else {
            throw new RuntimeException();
        }
    }

    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean contains(Object o) {
        return indexOf(0) > -1;
    }

    public Iterator<T> iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    private boolean needGrowCapacity(){
//        if
        return false;
    }

    public boolean add(T t) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {

    }

    public T get(int index) {
        return null;
    }

    public T set(int index, T element) {
        return null;
    }

    public void add(int index, T element) {


    }

    public T remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (data[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(data[i] == null)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator<T> listIterator() {
        return null;
    }

    public ListIterator<T> listIterator(int index) {
        return null;
    }

    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
