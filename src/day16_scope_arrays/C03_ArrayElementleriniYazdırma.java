package day16_scope_arrays;

import java.util.Arrays;

public class C03_ArrayElementleriniYazdırma {
    public static void main(String[] args) {

        int[] arr ={3,5,6,7,8,1,2};

        // tüm array i yazdırın
        System.out.println(Arrays.toString(arr));

        // Array'in tum elementlerini yanyana aralarinda bir bosluk olacak sekilde yazdirin

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
