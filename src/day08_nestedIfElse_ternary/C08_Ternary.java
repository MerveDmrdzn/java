package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {

        //kullanıcıdan bir harf isteyin
        //istenilen harf küçük harf ise onu büyük harf olrak yazdırın
        //yoksa girilen harfi yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        System.out.println(harf>='a'&&harf<='z' ? Character.toUpperCase(harf) : harf);
    }
}
