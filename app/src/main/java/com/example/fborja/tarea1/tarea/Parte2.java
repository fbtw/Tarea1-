package com.example.fborja.tarea1.tarea;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by fborja on 7/6/17.
 */

public class Parte2 {

    public static List<Integer> generar(int n){
        int i,N=n;                  //N: número inicial, n: número disminuyente
        ArrayList<Integer> lista=new ArrayList<>();
            for (i=2;i<N;i++){
                if (esprimo(i)) {
                    while (n%i==0){ //mientras el primo sea divisible es agregado a la lista
                        lista.add(i);
                        n /= i;
                    }
                }
            }
        for (int i2 : lista)        //imprime la lista
            System.out.print(i2+" ");

        System.out.print("= "+N);
        return lista;

    }
    private static boolean esprimo(long x) {
        for (int i = 2; i < (x / 2); i++)
            if (x % i == 0)
                return false;
        return true;
    }
    public static String tikitaka(int n){ //Fizzbuzz es muy mainstream
        String str="",salida="";
        for (int i = 1 ;i<=n;i++){
            if (i%15==0) {
                salida+="\nTiki-Taka";
                str="Tiki-Taka";
            }
            else if (i%3==0) {
                salida+="\nTiki";
                str="Tiki";
            }
            else if (i%5==0) {
                salida+="\nTaka";
                str="Taka";
            }
            else {
                salida+=("\n"+i);
                str=""+i;
            }
        }
        System.out.print(salida);
        return str;
    }

}
