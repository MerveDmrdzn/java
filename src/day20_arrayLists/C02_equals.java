package day20_arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class C02_equals {
    public static void main(String[] args) {

        List<Integer> sayılar1 = new ArrayList<>();
        sayılar1.add(3);
        sayılar1.add(8);
        sayılar1.add(1);
        sayılar1.add(2);

        List<Integer>sayılar2= new ArrayList<>();
        sayılar2.add(3);
        sayılar2.add(1);
        sayılar2.add(8);
        sayılar2.add(2);
        sayılar2.add(5);

        System.out.println(sayılar1.equals(sayılar2)); // false

        sayılar2.remove(4);
        System.out.println(sayılar1.equals(sayılar2));  // false

        // equals hem elementleri hem de index leri kontrol eder

        Collections.sort(sayılar1);
        Collections.sort(sayılar2);
        System.out.println("Sayılar1 : " + sayılar1);
        System.out.println("Sayılar2 : " + sayılar2);

        System.out.println(sayılar1.equals(sayılar2));

            }
        }




