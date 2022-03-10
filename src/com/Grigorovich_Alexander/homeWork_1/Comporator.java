package com.Grigorovich_Alexander.homeWork_1;

import java.util.Comparator;

public class Comporator implements Comparator<String[]> {
    @Override
    public int compare(String[] o1, String[] o2) {
        for (int i = 0; i < o1.length; i++) {
            if (o1[i].compareTo(o2[i]) == 0) {
                int s = i + 1;
                if (o1[s].compareTo(o2[s]) == 0) {
                    s++;
                    return o1[s].compareTo(o2[s]);
                }
            } else {
                return o1[i].compareTo(o2[i]);
            }
        }
        return 0;
    }
}
