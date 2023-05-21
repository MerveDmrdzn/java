package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class m01_calisma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen cinsiyetinizi giriniz(ör:E,ör:K):");
        char cinsiyet = scan.next().charAt(0);

        if (cinsiyet == 'k'  || cinsiyet=='K' || cinsiyet == 'e' || cinsiyet=='E') {
            System.out.println(Character.toUpperCase(cinsiyet));
        } else {
            System.out.println("Geçersiz karakter girdiniz,lütfen tekrar deneyiniz");
        }

        System.out.print("Lütfen yaşınızı giriniz:");
        double yas = scan.nextDouble();

        if (yas < 16 || yas > 100) {
            System.out.println("Yanlış yaş girişi yaptınız,lütfen tekrar deneyiniz");
        } else if (cinsiyet=='K'|| cinsiyet=='k' && yas <60) {
            System.out.println("Emekli olmak için " +(60-yas)+" yıl daha çalışmalısınız");
        } else if (cinsiyet=='E' || cinsiyet=='e' && yas<65) {
            System.out.println("Emekli olmak için " +(65-yas)+" yıl daha çalışmalısınız");
        } else {
            System.out.println("Emekli olabilirsiniz");
        }


    }
}
        


        

