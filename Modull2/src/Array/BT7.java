package Array;

import java.util.Scanner;

public class BT7 {
    public static Scanner sc= new Scanner(System.in);
    public void DUYET(int[][] array,int row, int col)
    {
        for(int i=0; i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(array[i][j]+" ");
            }
        }
        System.out.println();
    }
    public void NHAP(int[][] array,int row,int col)
    {
        for(int i=0; i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("nhap phan tu thu: ["+i+"]["+j+"] :");
                array[i][j]=sc.nextInt();
            }
        }
    }
    public int CHANCC(int[][] array, int row, int col){
        int s=0;
        if(col==row)
        {
            for(int i=0; i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    if(i==j)
                    {
                        s=s+array[i][j];
                    }
                }
            }
        }else{
            return 0;
        }
        return s;
    }
    public  static  void main(String[] args)
    {
        int [][] array;
        int col,row;
        System.out.println("Nhap vao so cot");
        col= sc.nextInt();
        System.out.println("Nhap vao so dong");
        row= sc.nextInt();
        array = new int[row][col];
        BT7 bt7= new BT7();
        bt7.NHAP(array,row,col);
        bt7.DUYET(array,row,col);
        if(bt7.CHANCC(array,row,col)==0)
        {
           System.out.print("Day khong phai ma tran vuong !!");
        }else{
            System.out.println("Tong cac so tren duong cheo chinh ma tran la:"+bt7.CHANCC(array,col,row));
        }
    }
}
