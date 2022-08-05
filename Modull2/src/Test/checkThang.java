package Test;

import java.util.Scanner;

public class checkThang {
    public static void main(String[] args)
    {
        int thang;
        Scanner scanner= new Scanner(System.in);
        System.out.print("ban muon nhap vao thang may: ");
        thang= scanner.nextInt();
        switch(thang){
            case 2:
                System.out.print("thang  2 co  28  hoac  29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("thang "+thang+" co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("thang "+thang+" co 30 ngay");
                break;
        }
    }

}
