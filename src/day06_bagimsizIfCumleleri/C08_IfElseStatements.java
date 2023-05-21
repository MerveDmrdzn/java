package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C08_IfElseStatements {
    public static void main(String[] args) {

        // soru 5: Kullanıcıdan bir karakter isteyin,
        //         girilen karakter küçük harf ise onu büyük harf olarak yazdırın
        //         yoksa girilen karakteri yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char krk= scan.next().charAt(0);

        if ('a'<= krk  &&  krk <= 'z'){
            System.out.println(Character.toUpperCase(krk));
        } else {
            System.out.println(krk);
        }
    }
}
