package com.gmail.mattg1827.javalib;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListTest {




    @Test
    public void addIntegerToList(){
        //Arrange
        JavaLibArrayList<Integer> unit = new JavaLibArrayList<Integer>();
        ArrayList<Integer> expected = new ArrayList<Integer>();

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
        JavaLibArrayList<String> unit = new JavaLibArrayList<String>();
        ArrayList<String> expected = new ArrayList<String>();

        //Act
        String sentence = "It was my best day ever.";
        unit.add(sentence);
        expected.add(sentence);

        //Assert
        assertEquals(expected.toString(), unit.toString());
    }
}
