package BaiTap.TimChuoiNganNhat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TimChuoiNganNhat {
    public static void main(String[] args) {
        String str = "The use of a lambda is possible because the Comparator interface has only a single method to implement so the VM can infer which method it's implementing";
        List<String> strings = Arrays.asList(str.split(" "));
        System.out.println("Cho mảng các chuỗi :");
        System.out.println(strings);
        List<String> shortestWords = new ArrayList<>();
        int shortest = Integer.MAX_VALUE;
        for (int i = 0; i < strings.size() - 1; i++) {
            if (shortest > strings.get(i).length()) {
                shortest = strings.get(i).length();
            }
        }
        for (String s : strings) {
            if (s.length() == shortest) {
                shortestWords.add(s);
            }
        }
        System.out.println(shortestWords);
    }
}
