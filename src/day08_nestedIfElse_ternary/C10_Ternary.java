package day08_nestedIfElse_ternary;

public class C10_Ternary {
    public static void main(String[] args) {

        // Kullanıcıdan bir tamsayı alın
        // sayı pozitise çift sayı veya çift sayı değil seçenekelrınden uygun olanı yazdırın
        // sayı poz değilse 3 basamaklı veya 3 basamalı değil yazdırın

        int sayi=-20;
        System.out.println(sayi>0 ? sayi%2==0 ? "çift sayı" : "çift sayı değil"
                                              :sayi<-1000 & sayi>-99 ? "3 basamaklı" : "3 basamaklı değil");

    }
}
