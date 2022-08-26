package stackandqueue.arrayList;

public class MyStackMain {
    public static void main(String[] args) {
        MyArrayStake myArrayStake= new MyArrayStake(3);
        System.out.println(myArrayStake.push(1));
        System.out.println(myArrayStake.push(2));
        System.out.println(myArrayStake.push(3));
        System.out.println(myArrayStake.push(4));

        myArrayStake.print();
        System.out.println(myArrayStake.pop());
        myArrayStake.print();

        System.out.println(myArrayStake.pop());
        System.out.println(myArrayStake.pop());
        myArrayStake.print();
        System.out.println(myArrayStake.pop());
        myArrayStake.print();
    }

}
