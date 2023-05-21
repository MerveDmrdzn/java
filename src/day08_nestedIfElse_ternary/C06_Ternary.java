package day08_nestedIfElse_ternary;

public class C06_Ternary {
    public static void main(String[] args) {

        // teernary operatörü ya direk sout içinde kullanılır
        // veya bir değişkene atama yapılacak şekilde yazılır

        int sayi = 19 ;
        // sayi%2==0 ? "sayi çift" : "tek sayi"; böyle başıboşca yazarsak kabul etmez java

        System.out.println( sayi%2==0 ? "sayi çift" : "tek sayi");
        // String sonuc = sayi%2==0 ? "sayi çift" : "tek sayi"; çalışmaz

        // int bir değeri stringe atayamayız sorumlulugu alsak da bu yöntemde olmaz


        // eğer true oldugundakı sonuc ıle false oldugundakı sonuc
       // farklı data turlerınde olursa yazdırılabılır ama atama yapılamamz

        // sayı çift ise sayı çift yazdırın
        // degılse sayıynın 2 katını yazdırın


        System.out.println(sayi%2==0 ? "sayi çift" : 2*sayi);
        //int sonuc2 = sayi%2==0 ? "sayi çift" : 2*sayi; çalışmaz

    }
}
