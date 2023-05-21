package day03_dataCasting_WrapperClasses;

public class C05_DataCasting {
    public static void main(String[] args) {

         /*
            Bazi primitive data turleri baska hic bir data turunden deger kabul etmez
            Bazi primitive data turleri ozel sartlar ile baska turdeki datalari deger olarak kabul eder
         */

        boolean bl=false;
        bl=true;

        // bl="true";   bunları kabul etmez boolean t,f datasıdır
        // bl=20;
        // bl='a';


        char ch= 't';
        ch='%';
        ch=' ';
        ch=99;


        int sayi1= 20;
        short sayi2= 15;
        double sayi3=24;

        sayi1=sayi2; // kabul eder çünkü short int datasına sığar

        //sayi1=sayi3; bunları kabul etmez çünkü sığmazlar
        //sayi2=sayi1;
        //sayi2=sayi3;


        sayi3=sayi1; // kabul eder çünkü int double a sıgar
        sayi3=sayi2;  // kabul eder çünkü short double a sığar

        sayi1=ch;
        //sayi2=ch; bunu kabul etmez çünkü ch da 16 bit yer kaplar short da
        sayi3=ch;

        // AUTO WIDENING denir bu işlemlere=  daha dar kapsamlıyı daha genişe almak
    }
}






