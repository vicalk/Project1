package com.project1;

import javax.swing.text.Utilities;
import java.util.*;

public class BubbleSort {

    List<Row> rows;

    public List<Row> bubblesort(List<Row> rows) {

        this.rows = rows;
        assert(rows != null): "List cannot be null";
        int size = rows.size();
        for(int pass = 1; pass < size; ++pass) {
            for(int left = 0; left < (size - pass); ++left) {
                int right = left + 1;
                if(rows.get(left).compareTo(rows.get(right)) > 0) {
                    Row buffer = rows.get(left);
                    rows.set(left, rows.get(right));
                    rows.set(right, buffer);
                }
            }
        }
        return rows;
    }
}



