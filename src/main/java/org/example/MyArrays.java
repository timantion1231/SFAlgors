package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MyArrays {
    public static int binarySearch(byte[] a, byte key) {
        return Arrays.binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(char[] a, char key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(double[] a, double key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(float[] a, float key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(int[] a, int key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(long[] a, long key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    public static int binarySearch(short[] a, short key) {
        return Arrays.binarySearch(a, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        int l = 0;
        int r = a.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int cmp = c.compare(a[mid], key);

            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        int l = fromIndex;
        int r = toIndex;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int cmp = c.compare(a[mid], key);

            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
