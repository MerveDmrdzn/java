package day16_scope_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String [] isimler = {"Yusuf","Mina","Merve"};
        int [] sayılar = {2,5,5,6,8,9,11,3,3,2,6};
        char  karakterler[]={'e','f','e'};

        // Array non-primitive data turlerindendir
        // Eger array'i liste seklinde olusturmayip
        // new keyword kullaniyorsak
        // UZUNLUGUNU yazmak ZORUNDAYIZ

        String[] arr = new String[5];
        System.out.println(isimler);  //[Ljava.lang.String;@568db2f2

        // Bir array tanimlanan uzunluktan daha fazla veya az eleman alamaz
        // Bir array'i yazdirmak istersek
        // Array'ler direk yazdirilamaz

        System.out.println(Arrays.toString(sayılar)); // [2, 5, 5, 6, 8, 9, 11, 3, 3, 2, 6]
        System.out.println(Arrays.toString(arr));   // [null, null, null, null, null]

        int[] a = new int[7];
        System.out.println(Arrays.toString(a));   //[0, 0, 0, 0, 0, 0, 0]

        // array'deki elementlere nasil ulasiriz ? index ile

        a[0]=4;  //[4, 0, 0, 0, 0, 0, 0]
        a[3]=7;  //[4, 0, 0, 7, 0, 0, 0]
        // a[7]=8;    ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(a));


        // sayilar array'inin 4.index'indeki elementi yazdirin
        System.out.println(sayılar[4]);

        // isimler array'inin 1.index'indeki ismi yazdirin
        System.out.println(isimler[0]);





    }
}
