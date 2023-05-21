package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {

        // kullanıcıdan yaiını alın
        // 65 yaş üstü ise emekli olabilir yazdırın
        // 65 yaştan küçük ise emekli olmana şu kadar var yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        double yas= scan.nextDouble();

        if (yas>= 65){
            System.out.println("Emekli olabilirsin");
        }  else {
            System.out.println("Emekli olabilmek için daha " +(65-yas)+" yıl çalışmalısın");
        }
    }
}
