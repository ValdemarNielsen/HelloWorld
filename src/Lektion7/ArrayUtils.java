package Lektion7;

import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8, 9};
        String b = arrayToString(a);
        System.out.println(b);
        int n = 4;
        System.out.println(occurences(a, n));
        System.out.println(sum(a));
    }

    public static String arrayToString(int[] a) {
        String ret = Arrays.toString(a);
        ret = ret.replace("[", "");
        ret = ret.replace(",", "");
        ret = ret.replace("{", "");
        ret = ret.replace("]", "");
        return ret;
    }

    public static int occurences(int[] a, int n) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                s++;
            }
        }
        return s;
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int num : a) {
            sum = sum + num;
        }
        return sum;
    }
}
