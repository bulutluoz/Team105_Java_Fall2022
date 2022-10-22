package ders22_arrayLists;

import java.util.Arrays;
import java.util.List;

public class C03_ArraysAsList {

    public static void main(String[] args) {

        Integer[] arr = {1,2,3};

        // verilen bir array'i list'e cevirmek icin
        // bir list olusturup, for loop ile elementleri tasimayi tavsiye ediyoruz

        List<Integer> arraydenList= Arrays.asList(arr);

        System.out.println(arraydenList); // [1, 2, 3]

        // Bu yontemin 2 negatif yonu vardir
        // 1- bu sekilde olusturulan list'ler esnek uzunluga sahip degillerdir
        //    add, remove gibi ozellikleri kullanmak isterseniz RunTimeException olusur

        // arraydenList.add(10); // UnsupportedOperationException
        // arraydenList.remove(1); // UnsupportedOperationException

        // 2- bu yontem kaynak olan array ile yeni olusturulan list'i birbirine baglar
        //    birinde yaptiginiz degisikligi, otomatik olarak digerine de yansitir

        System.out.println("Array : " + Arrays.toString(arr)); // [1, 2, 3]
        System.out.println("Liste : " + arraydenList);// [1, 2, 3]

        // sadece array'in bir elemanini degistirelim
        arr[0]=10;

        System.out.println("array'i degistirince Array : " + Arrays.toString(arr)); // [1, 2, 3]
        System.out.println("array'i degistirince Liste : " + arraydenList);// [1, 2, 3]
    }
}
