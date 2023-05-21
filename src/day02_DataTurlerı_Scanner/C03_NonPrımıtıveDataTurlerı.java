package day02_DataTurlerı_Scanner;

import java.util.Locale;

public class C03_NonPrımıtıveDataTurlerı {
    public static void main(String[] args) {

        String isim= "Yusuf Can";
        String ilkharf="K";
        char ilkharf2='m';

        //tek bir karakter kullanacaksak ikisini de kullanabiliriz

        System.out.println(ilkharf.toLowerCase()); // k
        System.out.println(ilkharf2);


        // sout yazıp ilkharfi çağırdığımda ve nokta koyduğumda
        // birçok method çıkar çünkü nonprımıtıve olmak bunu gerektırır :)
        // fakat char ı çağırsam hiçbir cacık olmaz
        // çünkü prımıtıve data da sadece değer vardır

        String metin="hgfocskhvafıkwşlggonbvcghjklşisyulşöm" +
                "dyuılbvcstyuıoşömbvcsrtyuıopşlmnbvcxflöm" +
                "hlşömnbvcxfyuıolşmnbvcdyulbvcxuılşömncxertyu" +
                "şömvcxzaypğiömcxzaşöxşi.çöbvcaiccvbnmöç.i" ;

        // çok geniş alanları kapsayabilir

        String not="not";
        String Not="Variable isimlerinin buyuk harf ile baslamasi tavsiye edilmez ama java kabul eder";
        String nOT="Bir kere deklare edilen variable tekrar deklare edilemez";
        String noT="ama isimler farkli sekilde yazildigi icin java bunlari farkli variable olarak kabul eder";

        // camelCase : kucuk harfle baslar, sonraki kelimeler bitisik yazilir ve ilk harfi buyuk olur
        // ilkHarf, ogrenciNo, okulDefteriDolabi gibi
        // naming convention = isimlendirme geleneği







    }
}
