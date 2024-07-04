package DmytroBondar.homeworks.hw03_JavaEssential.hw09_Generics.task2;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private Object[] data;

    public MyList() {
        this.size = 0;
        this.data = new Object[DEFAULT_CAPACITY];
    }

    public void add(E element) {
        if (size == data.length) {
            increaseCapacity();
        }
        data[size++] = element;
    }

    private void increaseCapacity(){
        Object[] newData = new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        }
        return (E) data[index];
    }

    public int size() {
        return size;
    }
}
