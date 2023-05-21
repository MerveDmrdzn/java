package day02_DataTurlerı_Scanner;

public class C02_DataTurlerı {
    public static void main(String[] args) {

        char ilkHarf='8'; // tek tırnak içinde tek karakter (sayı,harf,boşluk vs)
        byte ogrYasi1=15; // en doğru kullanım budur,hafıza kullanımını optımıze etmek için en doğrusu
        short ogrYasi2=16;
        int ogrYasi3=16;
        long ogrYasi4=15;

        double sayi1=3.12457863145789654d;
        System.out.println(sayi1); // 3.124578631457

        // double vırgulden sonra 16 hane yazdırır,çok küçük sayılara indiği için
        //  ama ondalıklı kısmın sonunda hatalar olabilir
        //  15 / 3 = 4.999999 veya 5.0 veya 5.00000 yazdırabilir

        float sayi2=45.248621893259f;

        // float sayı yazdığımızda doubledan ayırmak için
        // sonuna f ya da F yazarız
        System.out.println(sayi2); // 45.24862

        // biz dersler boyunca hafıza önemli olmadığı için
        // tamsayılar için int,ondalıklı sayılar için double kullanırız




    }
}


