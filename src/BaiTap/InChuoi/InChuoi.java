package BaiTap.InChuoi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class InChuoi {
    public static void main(String[] args) {
        String str = "Rekkei Academy để nông dân biết code";
        ArrayList<String> strings = new ArrayList<String>();
        Collections.addAll(strings, str.split(" "));
        System.out.println(strings);
        for (String s : strings) {
            if (s.length() > 3) {
                System.out.println(s);
            }
        }
    }
}
