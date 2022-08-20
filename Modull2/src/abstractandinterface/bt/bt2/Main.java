package abstractandinterface.bt.bt2;

public class Main {
    public static void main(String[] args) {
        Square square= new Square(2);
        System.out.println("square Area: "+square.getArea()+" Perimeter: "+ square.getPerimeter());
        Square1 square1= new Square1(7);
        System.out.println("square1 Area: "+square.getArea()+" Perimeter: "+ square.getPerimeter());
        square1.howToColor("to het 4 canh");

    }
}
