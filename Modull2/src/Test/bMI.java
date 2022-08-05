package Test;

import java.util.Scanner;

public class bMI {
    public static void main(String[]  args){
        float bmi,weight,height;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Input weight");
        weight= scanner.nextFloat();
        System.out.print("Input height");
        height= scanner.nextFloat();
        bmi=weight/height;
        System.out.println(bmi);
        if(bmi>=30)
        {
            System.out.print("Obese");
        }else if(bmi>=25){
            System.out.print("Overweight");
        }else if(bmi>=18.5){
            System.out.print("Normal");
        }else{
            System.out.print("Underweight");
        }

    }
}
