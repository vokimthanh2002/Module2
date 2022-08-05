package Array;
import java.util.*;
public class BT2 {
    private int X,index,number;
    private int [] array;
    public static Scanner sc= new Scanner(System.in);

    //Duyet mang
    public void ExportList()
    {
        for(int i=0;i<number+1;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.print("\n");
    }
    public void Add()
    {
        for(int i=number-1;i>=index;i--)
        {
            array[i+1]= array[i];
        }
        array[index]=X;
    }
    public void Processing()
    {
        System.out.print("Input number array: ");
        number= sc.nextInt();
        array= new int[number+1];
        for(int i=0;i<number;i++)
        {
            System.out.print("Input element index " +i+" : ");
            array[i]=sc.nextInt();
        }
        System.out.print("Input number add: ");
        X=sc.nextInt();
        System.out.print("Input index: ");
        index=sc.nextInt();
        if(index<=1 || index >=number-1)
        {
            System.out.print("Not delete!!");
        }else{
            Add();
            ExportList();
        }

    }
    public static void main(String[] args)
    {
        BT2 add= new BT2();
        add.Processing();
    }
}