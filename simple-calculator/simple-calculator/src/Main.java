import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("1. sayı:   ");
        int a = scan.nextInt();
        System.out.print("2. Sayı :     ");
        int b = scan.nextInt();

        System.out.println("işlem seçiniz :   ");
        System.out.println("1-  toplama");
        System.out.println("2-  çıkarma");
        System.out.println("3-  çarpma");
        System.out.println("4- bölme");
        System.out.println("işleminiz :   ");
        int select = scan.nextInt();


        if (select ==1){
            System.out.println("tsonuc:   "  + (a+b));
        } else if (select==2){
            System.out.println("sonuc:   "  + (a-b));
        }else if (select==3) {
            System.out.println("sonuc:   " + (a*b));
        }else if (select==4) {
            System.out.println("sonuc:   " + (a/b));
        }


    }
}


