package day09_switch_stringManipulation;

import java.util.Objects;
import java.util.Scanner;

public class m11 {
    public static void main(String[] args) {

        // girilen km yi m ye veya cm çevir

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen mesafeyi km olarak girin : ");
        double km = scan.nextDouble();
        System.out.println("lütfen çevirmek istediğiniz mesafe birimini girin : " +
                           " \nm veya cm olarak girin  ");
        String birim = scan.next();

        String   m = String.valueOf (km*1000);
        String cm = String.valueOf(km*10000);


        System.out.println(birim == cm  ? km*10000 : km*1000);

    }
}
