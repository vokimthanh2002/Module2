package ClassAndObiect.Th;

public class Circle {
    double radius;
    Circle(){
        radius =1;
    }
    Circle(double radius){
        this.radius= radius;
    }
    double getArea()
    {
        return this.radius*this.radius*Math.PI;
    }
    double getPerimeter(){
        return 2*this.radius*Math.PI;
    }
    void setRadius(double newRadius){
        this.radius= newRadius;
    }
}
