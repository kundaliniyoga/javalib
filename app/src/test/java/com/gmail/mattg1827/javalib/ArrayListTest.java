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
        String sentence = "It was my best day ever.";
        Integer number = 3;
        unit.add(number);
        expected.add(number);

        expected.clear();
        unit.clear();

        //Assert
        assertEquals(expected.toString(), unit.toString());
    }
}
