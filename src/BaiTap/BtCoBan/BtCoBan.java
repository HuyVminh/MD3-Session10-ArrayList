package BaiTap.BtCoBan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BtCoBan {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add((int) Math.round(Math.random() * 999 + 1));
        }
        System.out.println("Số phần tử của list : " + list.size());
        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("Số lớn nhất là " + Collections.max(list));

    }

}
