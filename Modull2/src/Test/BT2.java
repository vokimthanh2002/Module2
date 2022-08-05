package Test;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args){
        int so;
        Scanner scanner= new Scanner(System.in);
        System.out.print("nhap vao so bat ki");
        so= scanner.nextInt();
        int tram= so/100;
        int chuc=(so/10)%10;
        int dv= so%10;
        switch (tram) {
            case 1 -> System.out.print("Mot Tram");
            case 2 -> System.out.print("HaiTram");
            case 3 -> System.out.print("Ba Tram");
            case 4 -> System.out.print("Bon Tram");
            case 5 -> System.out.print("Nam Tram");
            case 6 -> System.out.print("Sau Tram");
            case 7 -> System.out.print("Bay Tram");
            case 8 -> System.out.print("Tam Tram");
            case 9 -> System.out.print("Chin Tram");
            default -> System.out.print("");
        }
            switch (chuc) {
                case 0 ->
                {
                    if(tram!=0)
                    {
                        System.out.print("Le");
                    }
                }
                case 1 -> System.out.print("Muoi");
                case 2 -> System.out.print("Hai muoi");
                case 3 -> System.out.print("Ba muoi ");
                case 4 -> System.out.print("Bon muoi");
                case 5 -> System.out.print("Nam muoi");
                case 6 -> System.out.print("Sau muoi");
                case 7 -> System.out.print("Bay muoi");
                case 8 -> System.out.print("Tam muoi");
                case 9 -> System.out.print("Chin muoi");
                default -> System.out.print("");
        }
          switch (dv) {
            case 1 -> System.out.print("Mot");
            case 2 -> System.out.print("Hai ");
            case 3 -> System.out.print("Ba ");
            case 4 -> System.out.print("Bon ");
            case 5 -> {
                if(chuc == 0){
                    System.out.print("nam");
                }else {
                    System.out.print("lam");
                }

            }
            case 6 -> System.out.print("Sau");
            case 7 -> System.out.print("Bay ");
            case 8 -> System.out.print("Tam ");
            case 9 -> System.out.print("Chin");
        }

    }
}
