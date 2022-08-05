package Array;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        int size,X,vt;
        int[] array;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ban  muon nhap vao mang bao nhieu so: ");
        size = scan.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu thu " + i + " : ");
            array[i] = scan.nextInt();
        }
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.print("Nhap X la so can chen: ");
        X=scan.nextInt();
        System.out.print("Nhap vi tri chen: ");
        vt=scan.nextInt();
        if(vt<=1 && vt>=array.length-1)
        {
            System.out.print("Khong chen duoc phan tu vao mang!! ");
        }else{
            for(int i=vt; i<array.length;i++)
            {
                array[i]=array[i+1];
            }
            array[vt]=X;
            for (int i : array) {
                System.out.print(i + "\t");
            }
        }

        }
    }
