package abstractandinterface.bt.bt1;

public class Shape implements Resizeable {
    private String color= "Green";
    private boolean filled= true;
    public Shape(){
    }
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled= filled;
    }


    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public void resize(double percent) {

    }
    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
    public static void printShape(Shape[] shape){
        for(Shape x: shape){
            System.out.println(x.toString());
        }
    }

    public static void main(String[] args) {
        Shape shape= new Shape();
        System.out.println(shape);
    }
}
