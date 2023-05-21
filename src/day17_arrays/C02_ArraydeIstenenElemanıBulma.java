package day17_arrays;

public class C02_ArraydeIstenenElemanıBulma {
    public static void main(String[] args) {

        // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //         ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int [] arr1={2,4,5,6,7,9,2,9};
        elemanSayısıYazdır(arr1,3);
        elemanSayısıYazdır(arr1,5);
        elemanSayısıYazdır(arr1,2);

        String[] arr2 = {"E","H","Y","Y","M","M"};
        elemanSayısıYazdır(arr2,"Y");
    }

    public static void elemanSayısıYazdır(int[] arr,int arananElement){

        int sayac = 0 ;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]== arananElement){
                sayac++;
            }
        }
        System.out.println(sayac);
    }

    public static void elemanSayısıYazdır(String [] arr,String arananElement){

        int sayac = 0 ;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].equals(arananElement)){
                sayac++;
            }
        }
        System.out.println(sayac);
    }
}
