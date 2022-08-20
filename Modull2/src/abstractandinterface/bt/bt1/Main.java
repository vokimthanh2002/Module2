package abstractandinterface.bt.bt1;

public class Main {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 100);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "blue", false);
        shapes[1] = new Rectangle(x, x, "pink", true);
        shapes[2] = new Square(x, "yellow", true);
        System.out.println("Truoc khi thay doi kich thuoc");
        for (Shape a : shapes){
            System.out.println(a);
        }
        System.out.println("Sau khi thay doi kich thuoc");
        for (Shape a : shapes) {
            a.resize( Math.random() * 10000);
        }
        System.out.println("\n");
        Shape.printShape(shapes);
    }
}
