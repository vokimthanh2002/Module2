package Test;

import java.util.Scanner;

public class checkNam {
    public static void main(String[] args){
        int nam;
        Scanner scanner= new Scanner(System.in);
        System.out.print("ban muon nhap vao nam bao nhieu: ");
        nam = scanner.nextInt();
        if(nam%4==0 && nam%100!=0 || nam%100==0  && nam%400==0)
        {
            System.out.print(nam+" day la nam nhuan");
        }else{
            System.out.print(nam+" day khong phai nam nhuan");
        }
    }
}
