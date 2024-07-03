package DmytroBondar.homeworks.hw03_JavaEssential.hw09_Generics.task3;

public class MyDictionary<K, V> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private Object[][] data;


    public MyDictionary() {
        this.size = 0;
        this.data = new Object[DEFAULT_CAPACITY][2];
    }

    public void add(K key, V value) {
        if (size == data.length) {
            increaseCapacity();
        }
        data[size][0] = key;
        data[size][1] = value;
        size++;
    }

    private void increaseCapacity() {
        Object[][] newData = new Object[data.length * 2][2];
        for (int i = 0; i < size; i++) {
            newData[i][0] = data[i][0];
            newData[i][1] = data[i][1];
        }
        data = newData;
    }

    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (data[i][0].equals(key)) {
                return (V) data[i][1];
            }
        }
        return null;
    }

    public int size() {
        return size;
    }
}
