package day12_forLoops;

public class calisma {
    public static void main(String[] args) {
        // verilen satır sayısıyla aşağıdaki şekilde kod yazınız
        // * * * *
        // * * *
        // * *
        // *

        for (int i = 4; i >=1 ; i--) {
            for (int j =1 ; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }

        System.out.println("--------");
        int satır =4;
        for (int i =0; i <satır; i++){
            for (int j = satır - i; j > 0 ; j--) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
