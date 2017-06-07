package com.example.fborja.tarea1;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import android.content.SharedPreferences;
import android.provider.Settings;

import com.example.fborja.tarea1.tarea.Parte1;

@RunWith(MockitoJUnitRunner.class)
public class Parte1Test {

    @Test
    public void unoTest() throws Exception {
        String txt=Parte1.uno();
        assertEquals("*",txt);
        System.out.println("test: "+txt);
    }
    @Test
    public void dosTest() throws Exception {
        String txt=Parte1.dos(8);
        assertEquals("********",txt);
        System.out.println("test: "+txt);
    }
    @Test
    public void tresTest() throws Exception {
        String txt=Parte1.tres(4);
        assertEquals("*",txt);
    }
    @Test
    public void cuatroTest() throws Exception {
        String txt=Parte1.cuatro(6);
        assertEquals("******",txt);
    }
    @Test
    public void cincoTest() throws Exception {
        String txt=Parte1.cinco(5);
        assertEquals("*********",txt);
    }
    @Test
    public void seisTest() throws Exception {
        String txt=Parte1.seis(20);
        assertEquals("*",txt);
    }
    @Test
    public void sieteTest() throws Exception {
        String txt=Parte1.siete(6);
        assertEquals("*",txt);
    }
}