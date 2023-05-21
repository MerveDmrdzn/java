package day21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_OrtakElementleriBulma {
    public static void main(String[] args) {

        // Verilen iki arrayin elementlerini karşılaştırıp
        // ikisinde ortak olan elementleri
        //  ayrı bir liste olarak veren bir program yazın

        Integer [] arr1 = {2,5,6,9};
        Integer [] arr2= {5,7,3,1};

        List<Integer> ortakElementlerListesi = new ArrayList<>();
        for (Integer each1:arr1) {
            for (Integer each2:arr2) {
                if (each1==each2 && !ortakElementlerListesi.contains(each1)){
                    ortakElementlerListesi.add(each1);
                }

            }
            
        }
        System.out.println(ortakElementlerListesi);
    }
}
