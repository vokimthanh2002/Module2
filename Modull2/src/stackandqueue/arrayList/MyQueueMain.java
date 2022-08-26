package stackandqueue.arrayList;

public class MyQueueMain {
    public static void main(String[] args) {
        MyArrayQueue myArrayStake= new MyArrayQueue(3);
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
