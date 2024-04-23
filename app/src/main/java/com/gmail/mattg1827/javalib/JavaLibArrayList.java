package com.gmail.mattg1827.javalib;

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

        for (int i = 0; i < SIZE; i++) {
            arrayToString.append(array[i]);
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
}
