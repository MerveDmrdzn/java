package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {

       /*
        Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.
        hatali giris yapilirscinsiyeta kullaniciyi uyarin
         */

        // birden fazla degiskene bagli if else statement'larini yazarken
        // once degiskenlerden birine gore ana yapiyi olusturalim
        // bu soruda cinsiyeti ana degisken yapalim
        // ikinci degiskeni ana degiskenin her bolumunde ayri ayri degerlendirelim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        double yas = scan.nextDouble();

        System.out.println("Lütfen cinsiyetinizi giriniz");
        char cinsiyet = scan.next().charAt(0);


        if (cinsiyet == 'k' || cinsiyet == 'K') {  // KADIN


            if (yas < 16  ||  yas > 80){
                System.out.println("Geçersiz yaş girişi yaptınız,tekrar deneyiniz");
            } else if (yas < 60) {
                System.out.println("Emekli olmak için " + (60-yas) + "yıl daha çalışmalısınız");
            } else {
                System.out.println("Emekli olabilirsiniz");
            }


        } else if (cinsiyet == 'e' || cinsiyet == 'E') {  // ERKEK


            if (yas < 16  ||  yas > 80){
                System.out.println("Geçersiz yaş girişi yaptınız,tekrar deneyiniz");
            } else if (yas < 65) {
                System.out.println("Emekli olmak için " + (65-yas) + "yıl daha çalışmalısınız");
            } else {
                System.out.println("Emekli olabilirsiniz");

            }

        } else {
            System.out.println("Geçersiz cinsiyet girişi yaptınız,tekrar deneyiniz");
        }
    }
}

        // büyük if şemasına Quter if else
        // küçük if  şemasına İnner if else  diyoruz