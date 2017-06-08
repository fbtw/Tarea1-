package com.example.fborja.tarea1.tarea;

import android.util.Log;

/**
 * Created by fborja on 7/6/17.
 */

public class Parte1 {


    public static String uno(){
        String s="*";
        System.out.println("1.- "+ s);
        return s;
    }
    public static String dos(int n){
        StringBuilder s= new StringBuilder();
        while(n>0) {
            s.append("*");
            n--;
        }
        System.out.println("2.- "+ s);
        return s.toString();
    }
    public static String tres(int n){
        String s= "*";
        System.out.println("3.- "+n+":");
        while(n>0) {
            System.out.println(s);
            n--;
        }
        return s;
    }
    public static String cuatro(int n){
        StringBuilder s= new StringBuilder();
        System.out.println("4.- "+n+":");
        while(n>0) {
            s.append("*");
            System.out.println(s);
            n--;
        }
        return s.toString();
    }
    public static String cinco(int x){
        int m,n=x;
        StringBuilder s= new StringBuilder();
        System.out.println("5.- "+n+":");
        while(n>0) {        //triángulo
            m=n-1;
            while (m>0){
                System.out.print(" ");
                m--;
            }
            if (n==x)s.append("*");
            else s.append("**");
            System.out.println(s);
            n--;
        }
        return s.toString();
    }
    public static String seis(int x){
        int m,n=x;
        StringBuilder s= new StringBuilder();
        System.out.println("6.- "+n+":");
        while(n>0) {        //triángulo
            m=n-1;
            while (m>0){
                System.out.print(" ");
                m--;
            }
            if (n==x)s.append("*");
            else s.append("**");
            System.out.println(s);
            n--;
        }
        while(n<(x-1)) {        //triángulo inverso
            m=n+1;
            while (m>0){
                System.out.print(" ");
                m--;
            }
            s.setLength(s.length() - 2);
            System.out.println(s);
            n++;
        }
        return s.toString();
    }
    public static String siete(int x){
        int m,n=x,L;
        StringBuilder s= new StringBuilder();
        System.out.println("7.- "+n+":");
        while(n>0) {        //triángulo
            m=n-1;
            while (m>0){
                System.out.print(" ");
                m--;
            }
            if (n==x)s.append("*");
            else s.append("**");
            if (n!=1) System.out.println(s);
            n--;
        }
        L=s.length()/2;
        if (L<4) System.out.println((new StringBuilder(s)).replace(L-1,L+2,"FB!"));
        else System.out.println((new StringBuilder(s)).replace(L-3,L+4,"FELIPE!"));
        while(n<(x-1)) {        //triángulo inverso
            m=n+1;
            while (m>0){
                System.out.print(" ");
                m--;
            }
            s.setLength(s.length() - 2);
            System.out.println(s);
            n++;
        }
        return s.toString();
    }
}
