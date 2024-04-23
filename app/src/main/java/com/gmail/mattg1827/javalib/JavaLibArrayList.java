package com.gmail.mattg1827.javalib;

public class JavaLibArrayList<T> {

    private final int DEFAULT_CAPACITY = 10;
    private int INITIAL_SIZE;
    private Object[] array;

    public JavaLibArrayList() {
        INITIAL_SIZE = 0;
        array= new Object[DEFAULT_CAPACITY];
    }

    public void add(T item) {
        array[INITIAL_SIZE] = item;
        INITIAL_SIZE++;
    }

   @Override
    public String toString(){
        StringBuilder arrayToString = new StringBuilder();
        arrayToString.append("[");

        for (int i = 0; i < INITIAL_SIZE; i++) {
            arrayToString.append(array[i]);
        }
        arrayToString.append("]");
        return arrayToString.toString();
    }

}
