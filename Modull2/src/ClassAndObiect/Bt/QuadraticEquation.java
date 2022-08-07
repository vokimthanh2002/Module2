package ClassAndObiect.Bt;

import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(){
    }
    public QuadraticEquation(double a, double b, double c){
        this.a= a;
        this.b= b;
        this.c= c;
    }
    //getter
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    // denta
    public double getDiscriminant(){
        return this.b*this.b-4*this.a*this.c;
    }
    // x1,x2
    public double getRoot1(){
        return (-this.b+Math.sqrt(this.b*this.b-4*this.a*this.c))/(2*this.a);
    }
    public double getRoot2(){
        return (-this.b-Math.sqrt(this.b*this.b-4*this.a*this.c))/(2*this.a);
    }
    //setter
    public void setA(double newA){
        this.a= newA;
    }
    public void setB(double newB){
        this.b= newB;
    }
    public void setC(double newC){
        this.c= newC;
    }
    public static  void main(String[] args){
        double a,b,c,d;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap a: ");
        a= sc.nextDouble();
        System.out.print("Nhap b: ");
        b= sc.nextDouble();
        System.out.print("Nhap c: ");
        c= sc.nextDouble();
        QuadraticEquation qe= new QuadraticEquation(a,b,c);
        d=qe.getDiscriminant();
        if(d<0){
            System.out.print("Phuong trinh vo nghiem");
        }else if(d==0)
        {
            System.out.print("Phuong trinh co nghiem kep\n x= "+qe.getRoot1());
        }else{
            System.out.print("Phuong trinh co 2 nghiem phan biet\n x1= "+qe.getRoot1()+ "\n x2= "+qe.getRoot2());
        }
    }
}