package Array;

import java.util.Scanner;

public class BT8 {
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args){
        String str;
        char x='a';
        int d=0;
        System.out.print("Nhap vao chuoi : ");
        str=sc.nextLine();
        System.out.println("Chuoi: "+str);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==x){
                d++;
            }
        }
        System.out.println("So lan xuat hien cua ki tu: "+d);
    }
}
