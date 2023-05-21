package day02_DataTurlerı_Scanner;

import java.util.Scanner;

public class C05_ScannerİlkGörev {
    public static void main(String[] args) {

        // kullanıcıdan bir sayı alın
        // ve sayinin karesini yazdirin

               Scanner scan= new Scanner(System.in);
               System.out.println("Lutfen bir sayi girin");
               double girilenSayi= scan.nextDouble();
               System.out.println("Girilen sayinin karesi : " + girilenSayi*girilenSayi);

               // in = içeriye bilgi almak  out = dışarıya bilgi vermek

    }
}
