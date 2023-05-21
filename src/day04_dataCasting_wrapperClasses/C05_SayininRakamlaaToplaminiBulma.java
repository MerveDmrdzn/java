package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C05_SayininRakamlaaToplaminiBulma {
    public static void main(String[] args) {

        // Kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlar toplamini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz");

        int girilenSayi= scan.nextInt(); // 135

        int rakam= girilenSayi % 10; // bu işlem birler basamağını verir
        int rakamlarToplami= rakam;  // r.top= şuanlık 5 dir

        // ========
        girilenSayi = girilenSayi / 10; // bu işlem tamsayının iki basamağını verir
        rakam = girilenSayi % 10 ; // bu işlem onlar basamağını verir
        rakamlarToplami = rakamlarToplami + rakam; // rt= 5 idi yeni rt 5+3=8
        // ======

        girilenSayi= girilenSayi / 10 ; // bu işlem yüzler bas veriri 13/10 ile 1 i elde ederiz
        rakam = girilenSayi % 10; // rakam= 1

        rakamlarToplami= rakamlarToplami + rakam; // rt=8 idi son rakam 1 eklenince rt=9
        System.out.println("Girilen sayinin rakamlar toplami : " + rakamlarToplami);
    }
}


