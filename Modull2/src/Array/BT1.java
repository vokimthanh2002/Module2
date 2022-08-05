package Array;

import java.util.Scanner;

public class BT1 {
    public  static  void main(String[]  args){
        int size;
        int []  array;
        int so,vt;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ban  muon nhap vao mang bao nhieu so: ");
        size= scan.nextInt();
        array = new int[size];
        for(int i=0; i<size;i++)
        {
            System.out.print("Nhap phan tu thu "+ i+" : ");
            array[i]= scan.nextInt();
        }
        for(int i : array)
        {
            System.out.print(i+"\t");
        }
        System.out.print("Nhap phan tu can xoa: ");
        so=scan.nextInt();
        vt= Index(so,array);
        if(Index(so,array)==-1)
        {
            System.out.print("So can xoa khong co trong mang");
            for(int i : array)
            {
                System.out.print(i+"\t");
            }
        }else{
            for(int i=vt;i<array.length-1;i++) {
               array[i]=array[i+1];
           }
            array[array.length-1]=0;
             for(int i : array)
            {
                System.out.print(i+"\t");
            }
        }
    }
    public static int Index(int x, int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(x==arr[i])
            {
                return i;
            }
        }return -1;
    }
    }
