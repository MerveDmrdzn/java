package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {


        // soru 4:Kullanıcıdan bir karakter girmesini isteyin,
        //        girilen karakterin büyük harf olup olmadığınıı yazdırın.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char krk = scan.next().charAt(0);

        // krk = A ile Z arasında mı ?

        if ('A' <= krk  &&  krk <= 'Z'){
            System.out.println("Girilen harf büyük harftir");
        } else {
            System.out.println("Girilen harf büyük harf değildir");

        }
    }
}
