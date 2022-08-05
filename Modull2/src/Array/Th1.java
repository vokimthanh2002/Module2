package Array;

import java.util.Scanner;

public class Th1 {
    public static void main(String[]  args)
    {
        int size;
        int [] myArray;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input array: ");
        size= scan.nextInt();
        myArray= new int[size];
        for(int i=0; i<size;i++)
        {
            System.out.print("Input array"+i+ ": ");
            myArray[i]= scan.nextInt();
        }
        for (int k : myArray) {
            System.out.print(k + "\t");
        }
        for (int j = 0; j < myArray.length / 2; j++) {
            int temp = myArray[j];
            myArray[j] = myArray[size - 1 - j];
            myArray[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int i : myArray) {
            System.out.print(i + "\t");
        }
    }
}
