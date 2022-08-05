package Array;

import java.util.Scanner;

public class TH2 {
    public static  void main(String[] args)
    {
        int size;
        int [] array;
        int so;
        Scanner scan= new Scanner(System.in);
        System.out.println("Ban muon nhap vao mang bao nhieu phan tu: ");
        size= scan.nextInt();
        array = new int[size];
        for(int i=0; i<size;i++){
            System.out.print("Input array"+i+ ": ");
            array[i]= scan.nextInt();
        }
        for(int k : array){
            System.out.print(k+"\t");
        }
        System.out.print("Nhap so can tim kiem");
        so=scan.nextInt();
        if(Find(so,array)==1)
        {
            System.out.print(so+" co trong mang");
        }else{
            System.out.print(so+" ko co trong mang");
        }
    }
    public static int Find(int so, int[] arr){
        for (int j : arr) {
            if (j == so) {
                return 1;
            }
        }
        return 0;
    }
}

