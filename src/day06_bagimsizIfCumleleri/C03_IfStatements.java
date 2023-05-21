package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("Üçgenin 3 kenar uzunluğunu giriniz");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();


        /* Javada 3'lu karşılastırma yoktur
        onun yerıne ikili karşılaştırmalar yapıp && ile birleştirebiliriz
         */

        if (kenar1 == kenar2 && kenar1== kenar3 && kenar1>0){
            System.out.println("Girilen kenarlar bir eşkenar üçgen oluşturur");
        }

        }
    }

