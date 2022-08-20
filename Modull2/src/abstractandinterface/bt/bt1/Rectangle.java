package abstractandinterface.bt.bt1;

public class Rectangle extends Shape implements Resizeable  {
    public  double width;
    public  double length;

    public Rectangle (){}
    public Rectangle(double width, double length){
        this.width=width;
        this.length= length;
    }
    public Rectangle(double width, double length,String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length= length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return width * this.length;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public void resize(double percent) {
        this.length *= (percent / 100);
        this.width += (percent / 100);
    }
    @Override
    public String toString(){
        return super.toString()+" chieu dai: "+getLength()+" chieu rong: "+getWidth()+ " Chu vi: "+ getPerimeter()+" Dien tich: "+getArea();
    }

}
