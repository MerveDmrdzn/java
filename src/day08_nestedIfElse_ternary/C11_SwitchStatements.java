package day08_nestedIfElse_ternary;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class C11_SwitchStatements {
    public static void main(String[] args) {

        // kullanıcıdan bir harf isteyin
        // o harfle baslyan gun ısmı varsa yazdırın
        // yoksa "geçersiz harf" yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf= scan.next().charAt(0);
        harf= Character.toUpperCase(harf);


        if (harf=='P'){
            System.out.println("Pazar,Pazartesi veya Perşembe");
        } else if (harf=='S') {
            System.out.println("Salı");
        } else if (harf=='C') {
            System.out.println("Cuma,Cumartesi veya Carsamba");
        } else {
            System.out.println("Geçersiz Harf");
        }

        System.out.println("-------------------------" );


        // daha düzenli ve kullanışlı olarak switch statements kullanabilriz
        // switch statements,switch in önünde yazılan değişkene eşit olan case i çalıştırır
        // çalışmaya başladıktan sonra
        // break görünceye kadar veya switch in sonuna kadar çalışır


        switch (harf){

            case 'S':
                System.out.println("Salı");
                break;
            case'C':
                System.out.println("Carsamba,Cuma veya Cumartesi");
                break;
            case 'P':
                System.out.println("Pazar,Pazartesi veya Perşembe");
                break;

            default:
                System.out.println("Geçersiz Harf");
        }



    }
}
