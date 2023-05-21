package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        /* Eğer bir olay için iki olasılık varsa
          bu olasılıklardan birisi mutlaka çaslışacaksa
          o zaman if else statements kullanırız

          ıf else statements da if bodysi veya else bodysi mutlaka calısır
          ikisinin birden çalışma ihtimali yoktur
          ikisinin de çalısmama ihtimalıde yoktur

       */


        //  Soru 5- Kullanicidan notunu alin
        //         50 veya daha buyukse ”Sinifi Gectin”,
        //         50’den kucukse “Maalesef kaldin” yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not = scan.nextDouble();

        if (not >= 50 && not <= 100) {
            System.out.println("Sınıfı Geçtin");
        } else {
            System.out.println("Maalesef Kaldın");
        }


        // Kullanıcıdan pozitif bir tamsayı alın
        // Sayının tek veya çift sayı olduğunu yazdırın

        System.out.println("Pozitif bir tamsayı giriniz");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Girilen sayı çift sayıdır");
        } else {
          System.out.println("Girilen sayı tek sayıdır");
        }

        // Kullanıcıdan pozitif bir tamsayı alın
        // 5 ile bölünüp bölünmediğini yazdrırın

        if (sayi % 5 == 0){
            System.out.println(" Sayı 5 İle tam bölünür");
        } else {
            System.out.println(" Sayı 5 ile tam bölünmez");
        }

    }
}
