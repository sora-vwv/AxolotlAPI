package axl.util;

public class ArrayList<T> extends List<T> {

    // добавляешь все значения из root в текущий ArrayList
    public ArrayList(List<T> root) {
    }

    // изначальный размер массива (не ArrayList, а массива, через который будет реализвация)
    public ArrayList(int initial) {
    }

    public ArrayList() {
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void add(T value) {

    }

    @Override
    public void addAll(List<T> list) {

    }

    @Override
    public void insert(int index, T value) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void remove(T value) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int indexOf(T value) {
        return -1;
    }

    @Override
    public boolean contains(T value) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

}
