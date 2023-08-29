package axl.util;

public abstract class List<T> {

    public abstract int size();

    public abstract boolean isEmpty();

    public abstract void add(T value);

    public abstract void addAll(List<T> list);

    public abstract void insert(int index, T value);

    public abstract void remove(int index);

    public abstract void remove(T value);

    public abstract T get(int index);

    public abstract int indexOf(T value);

    public abstract boolean contains(T value);

    public abstract Iterator<T> iterator();

}
