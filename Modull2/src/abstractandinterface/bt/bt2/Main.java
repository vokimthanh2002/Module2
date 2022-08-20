package abstractandinterface.bt.bt2;

public class Main {
    public static void main(String[] args) {
        Shape[] shape1= new Shape[3];
        shape1[0]= new Square(2);
        shape1[1]= new Square(3,"green",true);
        shape1[2]= new Square(4,"red",false);
        for(Shape i: shape1){
            System.out.println(i);
            i.howToColor();
        }


    }
}
