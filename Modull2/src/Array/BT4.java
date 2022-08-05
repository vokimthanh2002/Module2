package Array;

import java.util.Scanner;

public class BT4 {
    private int number;
    public static Scanner sc= new Scanner(System.in);
    public void DUYET(int[][] array,int col, int row)
    {
        for(int i=0; i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(array[i][j]+" ");
            }
        }
        System.out.println();
    }
    public void NHAP(int[][] array,int col,int row)
    {
        for(int i=0; i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print("nhap phan tu thu: ["+i+"]["+j+"]");
                array[i][j]=sc.nextInt();
            }
        }
    }
    public void MaxArray(int[][] array,int col, int row){
        int max=array[0][0];
        for(int i=0; i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                if(array[i][j]>max)
                {
                    max=array[i][j];
                }
            }
        }
        System.out.println("So lon nhat trong mang: "+ max);

    }
    public  static void main(String[] args){
        int[][] array;
        System.out.print("Nhap so cot");
        int col= sc.nextInt();
        System.out.print("Nhap so hang");
        int row= sc.nextInt();
        array= new int[col][row];
        BT4 bt4= new BT4();
        bt4.NHAP(array,col,row);
        bt4.DUYET(array,col,row);
        bt4.MaxArray(array,col,row);
    }
}
