package day21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Scanner;

public class srou3 {public static void main(String[] args) {
    //  kullanıcıdan main method içinde bir tamsayı alın ve girilen sayının
    //  pozitif tam bölenleri sayısını bulup bize dödüren bir method oluşturun

    Scanner scan = new Scanner(System.in);
    System.out.println("Lütfen bir tamsayı giriniz");
    int tamsayı = scan.nextInt();
    pozitifTamBolenleriSay(tamsayı);
    System.out.println("Tamsayımızın pozitif bölenleri şu kadardır:" + pozitifTamBolenleriSay(tamsayı));
    System.out.println("----------------");
    pozitifTamBolenleriBul(tamsayı);
    System.out.println("Tamsayımız pozitif bölen rakamları şunlardır :" + pozitifTamBolenleriBul(tamsayı));


}

    public static int pozitifTamBolenleriSay(int sayi) {

        int poztamsayıbölenleri = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                poztamsayıbölenleri ++;
            }
        }
        return poztamsayıbölenleri;
    }
    public static ArrayList<Integer> pozitifTamBolenleriBul(int sayi) {
        ArrayList<Integer> pozitifTamBolenSayılar = new ArrayList<Integer>();

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0 ) {
                pozitifTamBolenSayılar.add(i);
            }
        }

        return pozitifTamBolenSayılar;
    }


}
