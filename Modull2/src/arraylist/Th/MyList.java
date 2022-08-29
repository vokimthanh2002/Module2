package arraylist.Th;
import java.util.Arrays;

public class MyList<E> {
    private  int size= 0;
    public static final int DEFAULT_CAPACITY=10;
    private Object elements[];

    public MyList(){
        elements= new Object[DEFAULT_CAPACITY];
    }
    // tang gap doi kick thuoc
    public void ensureCapa(){
        int newSize= elements.length*2;
        elements= Arrays.copyOf(elements,newSize);
    }
    // them phan tu vao mang
    public void add(E e){
        if(size== elements.length){
            ensureCapa();
        }
        elements[size++]=e;
    }
    // cai dat phuong thuc get
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public static void main(String[] args) {
        MyList<Integer> myList= new MyList<>();
        myList.add(2);
        myList.add(3);
        myList.add(3);
        myList.add(4);
        System.out.println(myList.get(2));
    }

}
