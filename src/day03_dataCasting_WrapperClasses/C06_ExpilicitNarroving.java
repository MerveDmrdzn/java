package day03_dataCasting_WrapperClasses;

public class C06_ExpilicitNarroving {
    public static void main(String[] args) {

        double db1= 45.32;

        int in1= (int)db1;
        System.out.println(in1);  // 45 yazdırır ondalıklı kısmı atar

                                      // int in1= db1; eğer bunu yapmak istersek
                                     // yani int i double a yerleştirmek istiyorsak zorla yapabiliriz
                                    // sorumluluk alırız
                                   // daha genişi daha dara almaya Expilicit Narroving denir
                                   // double değerin önüne neyin içine almak istiyorsak
                                  // () içinde o data türünü yazarız

        db1=2856321962022d;

        in1=(int)db1;
        System.out.println(in1);   //2147483647 yazdırdı

        in1=34;
        byte by1=(byte) in1;
        System.out.println(by1); // 34

        in1=130;

        by1=(byte)in1;
        System.out.println(by1);  //  -126
    }
}
