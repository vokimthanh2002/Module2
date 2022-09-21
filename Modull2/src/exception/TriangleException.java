package exception;

import java.util.Scanner;

public class TriangleException  {
    public static void main(String[] args){
        System.out.println("Chuong trinh kiem tra tam giac");
        Scanner sc= new Scanner(System.in);

           try {
               System.out.println("Nhap canh a: ");
               int a= sc.nextInt();
               System.out.println("Nhap canh b: ");
               int b= sc.nextInt();
               System.out.println("Nhap canh c: ");
               int c= sc.nextInt();
               if(a<0|| b<0||c<0||a+b<=c||a+c<=b||b+c<=a) {
                   throw new IllegalTriangleException();
               }
           } catch (IllegalTriangleException e){
               System.err.println("nhap ngu vl");
           }catch (Exception e){
               System.out.println("loi ..");
           }
        System.out.println(Math.PI);
    }
}
