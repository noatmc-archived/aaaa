package me.noat.sortingalgorithm.helper;

import java.util.Comparator;

public class DataComparator implements Comparator<Data> {
    @Override
    public int compare(Data o1, Data o2) {
        return o1.data.compareTo(o2.data);
    }
}
