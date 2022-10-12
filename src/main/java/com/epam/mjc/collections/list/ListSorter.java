package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ListSorter {

    public  void sort(List<String> sourceList) {

        ListComparator comparator = new ListComparator();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (String s : sourceList) {
            arrayList.add(Integer.valueOf(s));
        }

        arrayList.sort(comparator);
        sourceList.clear();

        for (Integer integer : arrayList) {
            sourceList.add(String.valueOf(integer));
        }

    }
}

class ListComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {

        int res = (int) ((Math.pow(5 * a, 2) + 3) - (Math.pow(5 * b, 2) + 3));

        if (res == 0)
            res = -1;

        return res;
    }
}
