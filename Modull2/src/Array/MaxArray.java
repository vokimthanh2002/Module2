package Array;

import java.util.Scanner;

public class MaxArray {
    public  static void main(String[] args){
        int size;
        int [] array;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ban muon nhap vao mang bao nhieu so: ");
        size= scan.nextInt();
        array = new int[size];
        for(int i=0; i<size;i++)
        {
            System.out.print("Nhap phan tu thu "+i +": ");
            array[i]=  scan.nextInt();
        }
        for (int k: array){
            System.out.print(k+"\t");
        }
        System.out.println("\n");
        System.out.println("So lon nhat trong mang la: "+ Max(array));
    }
    public static int Max(int[] arr){
        int max= arr[0];
        for(int i=1; i<arr.length;i++)
        {
           if(arr[i]>max) {
               max=arr[i];
           }
        }
        return max;
    }
}
