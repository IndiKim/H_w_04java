package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> A = new ArrayList<>();
        A.add("Joy");
        A.add("Thiago");
        A.add("Nano");
        A.add("Victoria");
        A.add("Anna");
        System.out.println("Spisok" + A);

        ArrayList<String> B = new ArrayList<>();
        B.add("David");
        B.add("Carlos");
        B.add("Arturo");
        B.add("Angela");
        B.add("Ursula");
        System.out.println("Spisok" + B);


        ArrayList<String> C = new ArrayList<>();
        C.add(A.get(0));
        C.add(B.get(4));
        C.add(A.get(1));
        C.add(B.get(3));
        C.add(A.get(2));
        C.add(B.get(2));
        C.add(A.get(3));
        C.add(B.get(1));
        C.add(A.get(4));
        C.add(B.get(0));
        System.out.println("Spisok" + C);
        Collections.sort(C, new Comparator<String>() {


            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });
        System.out.println(C);
    }
}

