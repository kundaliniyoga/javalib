package com.gmail.mattg1827.javalib;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListTest {

    private JavaLibArrayList<Integer> unit;
    private ArrayList<Integer> expected;

    @BeforeEach
    public void setup(){
        unit = new JavaLibArrayList<>();
        expected = new ArrayList<>();
    }

    @Test
    public void setCapacity(){
        //Arrange
        JavaLibArrayList<String> actualList = new JavaLibArrayList<>(20);

        //Act
        int actual = actualList.getCapacity();

        //Assert
        assertEquals(20, actual);
    }

    @Test
    public void addIntegerToList(){
        //Act
        Integer number = 3;
        unit.add(number);
        expected.add(number);

        //Assert
        assertEquals(expected.toString(), unit.toString());
    }

    @Test
    public void addStringToList(){
        //Arrange
        JavaLibArrayList<String> unitString = new JavaLibArrayList<>();
        ArrayList<String> expectedString = new ArrayList<>();

        //Act
        String sentence = "It was my best day ever.";
        unitString.add(sentence);
        expectedString.add(sentence);

        //Assert
        assertEquals(expectedString.toString(), unitString.toString());
    }

    @Test
    public void clearList(){
        //Act
        Integer number = 3;
        unit.add(number);
        expected.add(number);

        expected.clear();
        unit.clear();

        //Assert
        assertEquals(expected.toString(), unit.toString());
    }

    @Test
    public void addToIndex(){
        //Act
        Integer number = 77;
        for (int i = 0; i < 6; i++) {
            expected.add(i);
            unit.add(i);
        }
        expected.add(6, number);
        unit.add(6, number);

        //Assert
        assertEquals(expected.toString(), unit.toString());
    }

    @Test
    public void checkSize(){
        //Act
        for (int i = 0; i < 6; i++) {
            expected.add(i);
            unit.add(i);
        }
        int expectedSize = expected.size();
        int actualSize = unit.size();

        //Assert
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void checkInvalidIndexWhenAdding(){
        //Act
        Integer number = 77;
        for (int i = 0; i < 6; i++) {
            unit.add(i);
        }
        int actual = unit.add(99, number);

        //Assert
        assertEquals(-1, actual);
    }
}
