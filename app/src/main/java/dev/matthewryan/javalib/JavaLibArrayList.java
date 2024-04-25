package dev.matthewryan.javalib;

public class JavaLibArrayList<T> {

    private final int DEFAULT_CAPACITY = 10;
    private int CAPACITY = 10;
    private int SIZE;
    private Object[] array;

    public JavaLibArrayList() {
        SIZE = 0;
        array= new Object[DEFAULT_CAPACITY];
    }

    public JavaLibArrayList(int i) {
        SIZE = 0;
        CAPACITY = i;
        array= new Object[CAPACITY];
    }

    public void add(T item) {
        array[SIZE] = item;
        SIZE++;
    }

   @Override
    public String toString(){
        StringBuilder arrayToString = new StringBuilder("[");
        if (size() != 0){
           for (int i = 0; i < SIZE - 1; i++) {
               arrayToString.append(array[i] + ", ");
           }
           arrayToString.append(array[SIZE - 1]);
       }
        arrayToString.append("]");
        return arrayToString.toString();
    }

    public void clear() {
        for (int to = SIZE, i = SIZE = 0; i < to; i++)
            array[i] = null;
    }

    public int getCapacity() {
        return CAPACITY;
    }

    public int add(int index, T item) {
        if ((SIZE+1 < CAPACITY) && !(index < 0) && !(index > size())) {
            if (index != SIZE+1) {
                for (int i = SIZE+1; i > index; i--)
                    array[i] = array[i-1];
            }
            array[index] = item;
            SIZE++;
            return index;
        }
        return -1;
    }

    public int size() {
        return SIZE;
    }

    public void remove(T i) {

    }
}
