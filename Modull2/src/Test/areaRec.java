package Test;

import java.util.Scanner;

public class areaRec {
    public static void main(String[] args)
    {
        float width;
        float height;
        Scanner scanner=  new Scanner(System.in);
        System.out.print("Input width");
        width= scanner.nextFloat();
        System.out.print("Input height");
        height= scanner.nextFloat();
        float area= width*height;
        System.out.print("area :"+ area);
    }
}
