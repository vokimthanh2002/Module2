package Array;

import java.util.Scanner;

public class BT3 {
    public static Scanner sc= new Scanner(System.in);

    public void DUYET(int[] array)
    {
        for(int i=0; i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public void NHAP(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print("Nhap phan tu thu "+i+": ");
            array[i]=sc.nextInt();
        }

    }
    public static void main(String[] args)
    {
        BT3 bt3= new BT3();
        System.out.print("Ban muon nhap bao nhieu phan tu vao mang: ");
        int number1= sc.nextInt();
        int[] array1 = new int[number1];
        bt3.NHAP(array1);
        bt3.DUYET(array1);
        System.out.print("Ban muon nhap bao nhieu phan tu vao mang: ");
        int number2= sc.nextInt();
        int[] array2 = new int[number2];
        bt3.NHAP(array2);
        bt3.DUYET(array2);
        int[] array3= new int[number1+number2];
        for(int i=0;i<array1.length;i++)
        {
            array3[i]=array1[i];
        }
        for(int i=0;i<array2.length;i++)
        {
            array3[i+array1.length]=array2[i];
        }
        System.out.print("Mang sau khi da gop: ");
        bt3.DUYET(array3);
    }


}
