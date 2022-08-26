package stackandqueue.linkedList.th;

import java.util.LinkedList;

public class MyGenericStack<T> {

    private LinkedList<T> stack;

    MyGenericStack(){
        stack= new LinkedList<>();
    }
    public void push(T elememts){
        stack.addFirst(elememts);
    }
    public T pop(){
        if(stack.size()==0){
            System.out.println("My Genneric Stack empty");
        }
            return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if(stack.isEmpty())
        {
            return true;
        }
        return false;
    }
    public  void print(){
        if(stack.size()==0){
            System.out.println("My Genneric Stack empty");
        }else{
            for(int i=0; i<stack.size();i++){
                System.out.print(stack.get(i)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyGenericStack<Integer> myGenericStack= new MyGenericStack<>();
        System.out.println("Size: "+ myGenericStack.size());
        myGenericStack.push(1);
        myGenericStack.push(2);
        myGenericStack.push(3);
        myGenericStack.push(4);
        myGenericStack.push(5);
        System.out.println(myGenericStack.isEmpty());
        myGenericStack.print();
        System.out.println("Size: "+ myGenericStack.size());
        myGenericStack.pop();
        myGenericStack.print();
        myGenericStack.pop();
        myGenericStack.print();
        myGenericStack.pop();
        myGenericStack.print();
        myGenericStack.pop();
        myGenericStack.print();
        myGenericStack.pop();
        myGenericStack.print();
        System.out.println("Size: "+ myGenericStack.size());
        System.out.println(myGenericStack.isEmpty());

    }

}
