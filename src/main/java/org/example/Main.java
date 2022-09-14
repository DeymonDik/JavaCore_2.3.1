package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] a = str.split(" ");
        a = Arrays.stream(a).sorted().toArray(String[]::new);

        List<String> list = new ArrayList<>();
        Collections.addAll(list, a);
        list.sort(Comparator.comparingInt(String::length));
        a = list.toArray(new String[0]);

        String sim = "";
        for(String el:a) {
            System.out.print(sim + el);
            sim = " ";
        }
    }
}