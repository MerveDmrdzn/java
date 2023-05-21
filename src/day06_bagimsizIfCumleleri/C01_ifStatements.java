package day06_bagimsizIfCumleleri;

public class C01_ifStatements {
    public static void main(String[] args) {

        /*
            Buradaki sartlar birbirinden bagimsizdir
            uygun sayilar olursa 3 if body'si de calisabilir
            bazen de hicbir if body'si devreye girmeyebilir

            kodumuz konsolda hicbir sey yazdirmadi
            ancak
            Process finished with exit code 0
            yazmasindan kodun hicbir sorun olmadan calistigini anliyoruz

            sadece degerler sartlari saglamadigi icin
            konsolda bir sey yazdirilmadi

         */


          int a = 20;
          int b = 30;

          if (a>b){
              System.out.println("a b'den büyük ");
          }

          if (a%2==0){
              System.out.println("a çift sayıdır");
          }

          if (b>100){
              System.out.println("b 100'den büyüktür");
          }

          boolean sonuc = a*7 > b ;

          /* bazen if statement'da direk boolean bir değer sart olarak yazdırabilir
             bu durumda boolean variable değeri true ise if body calışır
             false ise is body çalışmaz
           */

        if (sonuc){
            System.out.println("istenen şart sağlandı");
        }

    }
}
