package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {

        // kullanıcıdan bir tamsayı alın
        // mutlak değerıne cevırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayi = scan.nextInt();

        /*
        if (sayi >= 0){
            System.out.println(sayi);
        } else {
            sayi = sayi*(-1);
            System.out.println(sayi);
        }
        */

       sayi= sayi>=0 ? sayi : sayi*(-1);
        System.out.println(sayi);

        // basit sorularda ternary tercıh edebılırız
    }
}
