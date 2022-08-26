package stackandqueue.arrayList;

public class MyArrayQueue implements IStackQueue {
    private int[] array;
    private int SIZE;
    private int headIndex;
    private int tailIndex;

    // constructor
    MyArrayQueue(int size){
        SIZE= size;
        array= new int[SIZE];
        headIndex= tailIndex=-1;

    }

    @Override
    public boolean push(int value) {
        if(!isFull()){
            if(isEmpty()){
                headIndex++;
            }
            tailIndex++;
            array[tailIndex]=value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value =-1;
        if(!isEmpty()){
            value=array[headIndex];
            headIndex++;
            if(headIndex>tailIndex){
                headIndex=tailIndex=-1;
            }
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return tailIndex==SIZE-1;
    }

    @Override
    public boolean isEmpty() {
        return (headIndex==-1) && (tailIndex==-1);
    }

    @Override
    public void print() {
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            for(int i=headIndex;i<=tailIndex;i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }


    }
//    public  int count(int[] array){
//        int count=0;
//        for(int i=0; i<array.length;i++){
//            count++;
//        }
//        return count;
//    }
    public int count(){
        if(isEmpty()){
            return 0;
        }else{
            return tailIndex-headIndex+1;
        }
    }

}
