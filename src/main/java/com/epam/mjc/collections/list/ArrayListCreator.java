package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {

        int c = 0;

        ArrayList<String> res = new ArrayList<>();

        for (String s : sourceList) {
            c++;
            if (c % 3 == 0) {
                res.add(s);
                res.add(s);
            }
        }
        return res;
    }
}
