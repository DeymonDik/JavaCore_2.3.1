package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        List<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i<a; i++) {
            b.add(in.nextInt());
        }
        Map<Integer,Integer> m = b.stream().collect(Collectors.toMap(c->c,c->1,Integer::sum));
        Map<Integer, Integer> sortedMap = m.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));
        sortedMap.forEach((k,v)->System.out.println(k + " " + v));
    }
}