package ders19_arrays;

import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,8,9,3,7,2,5,8,1};

        System.out.println(Arrays.binarySearch(arr,8)); // 7
        System.out.println(Arrays.binarySearch(arr,5)); // -2
        System.out.println(Arrays.binarySearch(arr,1)); // 0
        System.out.println(Arrays.binarySearch(arr,9)); // -10
        /*
          Binary search method'unun dogru sonuclar verebilmesi icin
          oncelikle sort method'u kullanilmalidir.

          sort() kullanmadan binarySearch() ile yapilan aramanin sonucu belli olmaz
          dogru sonuc da verebilir, yanlis sonuc da

         */

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 1, 2, 3, 5, 7, 8, 8, 9]

        System.out.println(Arrays.binarySearch(arr,8)); // 6
        System.out.println(Arrays.binarySearch(arr,5)); // 4
        System.out.println(Arrays.binarySearch(arr,1)); // 1
        System.out.println(Arrays.binarySearch(arr,9)); // 8


        // array'de olmayan bir eleman aratirsak
        // java once o sayi array'de olsa nerede olurdu onu bulur
        // sonra buldugu bu SIRA'yi - isareti ile verir

        System.out.println(Arrays.binarySearch(arr,-3)); // -1
        System.out.println(Arrays.binarySearch(arr,4)); // -5
        System.out.println(Arrays.binarySearch(arr,10)); // -10
        System.out.println(Arrays.binarySearch(arr,100)); // -10


    }
}
