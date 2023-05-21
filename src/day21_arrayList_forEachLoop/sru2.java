package day21_arrayList_forEachLoop;

import java.util.Scanner;

public class sru2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Lütfen adınızı giriniz: ");
    String ad = scanner.nextLine();

    System.out.print("Lütfen soyadınızı giriniz: ");
    String soyad = scanner.nextLine();

    String tamAd = tamAdOlustur(ad, soyad);
    System.out.println("Tam adınız: " + tamAd);
}

    public static String tamAdOlustur(String ad, String soyad) {
        String ilkHarfBuyukAd = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase() ;
        String ilkHarfBuyukSoyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase() ;
        return ilkHarfBuyukAd + " " + ilkHarfBuyukSoyad;
    }
}

