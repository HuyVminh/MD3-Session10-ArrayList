package BaiTap.SapXepGiamDan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SapXepGiamDan {
    public static void main(String[] args) {
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            listNumbers.add((int) Math.round(Math.random() * 999 + 1));
        }
        System.out.println("Danh sách trước khi sắp xếp : " + listNumbers);
        Collections.sort(listNumbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("Danh sách sau khi sắp xếp : " + listNumbers);
    }
}
