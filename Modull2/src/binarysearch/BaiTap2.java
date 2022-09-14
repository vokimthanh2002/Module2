package binarysearch;

import java.util.Random;
import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tg = array[i];
                    array[i] = array[j];
                    array[j] = tg;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("Nhap gia tri can tim kiem: ");
        int value = sc.nextInt();
        System.out.println(binarySearch(array, 0, array.length - 1, value));
    }
    public static int binarySearch(int[] arr, int left, int right, int value) {
        if (left > right) {
            return -1;
        } else {
            int middle = (left + right) / 2;
            if (arr[middle] == value) {
                return middle;
            } else if (value > arr[middle]) {
                return binarySearch(arr, middle + 1, right, value);
            } else if (value < arr[middle]) {
                return binarySearch(arr, left, middle - 1, value);
            }
        }
        return -1;
    }
}
