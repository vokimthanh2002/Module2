package abstractandinterface.bt.bt1;

public class Square extends Shape implements Resizeable{
    public double size;

    public Square() {
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public double getPerimeter() {
        return 4*this.size;
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

    @Override
    public void resize(double percent) {
        this.size *= (percent / 100);
    }
    @Override
    public String toString(){
        return super.toString()+ " Size: "+ size+ " Chu vi: "+ getPerimeter()+ " Dien tich: "+getArea();
    }
}
