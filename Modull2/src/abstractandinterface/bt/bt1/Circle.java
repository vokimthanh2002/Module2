package abstractandinterface.bt.bt1;

public class Circle extends Shape implements Resizeable {
    public double radius;

    public Circle(){}
    public Circle(double radius){
        this.radius= radius ;
    }
    public Circle(double radius,String color, boolean filed){
        super(color,filed);
        this.radius= radius ;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }



    @Override
    public String toString(){
        return super.toString()+" Ban kinh: "+getRadius()+" Dien tich "+getArea()+" Chu vi: "+getPerimeter();
    }
    @Override
    public void resize(double percent){
        this.radius*=(percent/100);
    }

    public static void main(String[] args) {
        Circle circle= new Circle(3,"Green",true);
        System.out.println(circle);
    }
}
