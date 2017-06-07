package com.example.fborja.tarea1;

import com.example.fborja.tarea1.tarea.Parte1;
import com.example.fborja.tarea1.tarea.Parte2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class Parte2Test {

    @Test
    public void generarTest() throws Exception {
        List<Integer> num = Arrays.asList(2,3,5);
        assertEquals(num,Parte2.generar(30));
    }
    @Test
    public void tikitakaTest() throws Exception {
        assertEquals("Taka",Parte2.tikitaka(100));
    }
}