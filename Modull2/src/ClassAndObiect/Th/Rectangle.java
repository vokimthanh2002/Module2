package ClassAndObiect.Th;

import java.util.Scanner;

public class Rectangle {
    public static Scanner sc= new Scanner(System.in);
    double  length,width;
    public Rectangle(){
    }
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return  this.width;
    }

    public void setLength(double newLength){
        this.length= newLength;
    }
    public void setWidth(double newWidth){
        this.width=newWidth;
    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return (this.length*this.width)*2;
    }
    public String disPlay(){
        return "Retangle {"+ "width: "+this.width+ "length: "+this.length+"}";
    }
    //main
    public static void main(String[] args){
        double length,width;
        System.out.print("Nhap chieu dai: ");
        length= sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        width= sc.nextDouble();
        Rectangle rec1= new Rectangle(length,width);
        System.out.println("Display: "+ rec1.disPlay());
        System.out.println("Area: "+ rec1.getArea());
        System.out.println("getPerimeter: "+ rec1.getPerimeter());
    }
}
