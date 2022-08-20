package abstractandinterface.bt.bt2;

public class Square extends Shape {
    public double size;

    public Square() {
    }

    public Square(float size){
        this.size= size;
    }

    public Square(double size, String color, boolean filled) {
        super(color,filled);
        this.size = size;
    }
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public double getPerimeter(){
        return 4*this.size;
    }
    public double getArea() {
        return size * size;
    }
    @Override
    public String toString(){
        return super.toString()+ " Size: "+ size+ " Chu vi: "+ getPerimeter()+ " Dien tich: "+getArea();
    }

}
