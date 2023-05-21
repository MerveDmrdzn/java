package day05_incrementDecrement_Cocation;

public class C03_Concatenation {
    public static void main(String[] args) {

        // Bir String başka bir String veya baska data türünden bir variable ile
        // + ile birleştirilebilir

        String a = "Java";
        String b = "Güzeldir";

        System.out.println(a+b);  // JavaGüzeldir

        System.out.println(a +" " + b);  // Java Güzeldir

        int c= 10;
        int d= 20;

        System.out.println(a+c+d); // Java1020

        // Eğer bir String ile başka data türündeki bir değer toplanırsa Java sonucu String yapar

          // Peki Java30 yazdırmak istersek

            System.out.println(a+(c+d));   // Java30
            System.out.println(a+c*d);     // Java200
            System.out.println(d+c+a);    // 30Java
    }
}
