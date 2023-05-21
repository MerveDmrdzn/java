package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {

        // Kullanıcıdan pozitif bir tamsayı alın
        // sayı çift ise "sayi çift"
        // değilse "tek sayı" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("çift sayi");
        } else {
            System.out.println("tek sayi");
        }


        System.out.println(sayi%2==0 ? "çift sayi" : "tek sayi");
        // bu şekilde yazma işlemine ternary deniliyor
    }



    }



