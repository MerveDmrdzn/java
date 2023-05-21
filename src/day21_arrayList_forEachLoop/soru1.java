package day21_arrayList_forEachLoop;

public class soru1 { public static void main(String[] args) {

        /*
         Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        bir method olusturun.
                - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        mesaji verin
               - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        yazdirin.

        */

    String metin = "merhaba dostlar nabersiniz";
    yazdir(metin, 1, 5);

}

    public static void yazdir(String str, int baslangic, int bitis) {
        if (baslangic >= bitis) {
            System.out.println("Hatalı giriş: Başlangıç değeri, bitiş değerinden büyük veya eşit olamaz.");
            return;
        }
        if (baslangic < 0 || bitis > str.length()) {
            System.out.println("Hatalı giriş: Başlangıç veya bitiş değeri, metnin uzunluğundan veya 0'dan küçük olamaz.");
            return;
        }
        for (int i = baslangic; i < bitis; i++) {
            System.out.print(str.charAt(i));
        }

    }

    }

