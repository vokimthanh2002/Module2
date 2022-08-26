package stackandqueue.linkedList.th;

public class QueueUseArray {
    private int capacity;
    private int[] queueArray;
    private int head=0;
    private int tail=-1;
    private int currentSize=0;

    public QueueUseArray(int queueSize){
        this.capacity=queueSize;
        queueArray= new int[this.capacity];
    }

    public boolean isQueueFull(){
        boolean status= false;
        if(currentSize==capacity){
            status=true;
        }
        return status;
    }

    public boolean isQueueEmpty(){
        boolean status= false;
        if(currentSize==0){
            status=true;
        }
        return status;
    }

    // them vao cuoi hang doi
    public void enqueue(int item){
        if(isQueueFull()){
            System.out.println("Queue full");
        }else{
            tail++;
            if(tail==capacity-1){
                tail=0;
            }
            queueArray[tail]=item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }
    // xoa phan tu dau hang doi

    public void dequeue(){
        if(isQueueEmpty()){
            System.out.println("Queue empty not delete");

        }else{
            head++;
            if(head== capacity-1){
                System.out.println("Pop operation done ! removed: " + queueArray[head - 1]);
                head = 0;
            }else {
                System.out.println("Pop operation done ! removed: " + queueArray[head - 1]);
            }
            currentSize--;
        }
    }

}
