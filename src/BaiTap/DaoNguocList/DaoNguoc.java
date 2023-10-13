package BaiTap.DaoNguocList;

import java.util.ArrayList;

public class DaoNguoc {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add((int) Math.round(Math.random() * 999 + 1));
        }
        System.out.println("Danh sách trước khi đảo ngược là : " + list);
        ArrayList<Integer> reverseList = new ArrayList<Integer>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }
        System.out.println("Danh sách sau khi đảo ngược là : " + reverseList);

    }
}
