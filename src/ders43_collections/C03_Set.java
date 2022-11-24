package ders43_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    public static void main(String[] args) {

        // verilen bir array'in tekrar eden elementlerini silip
        // her elementin sadece 1 kere kullanildigi hale getirin


        int [] arr = {6,4,3,2,3,5,6,4,3,2,4,6,3,2,1,2,4,5,5,1};

        Set<Integer> geciciSet= new HashSet<>();

        for (Integer each: arr
             ) {
            geciciSet.add(each);
        }

        arr=new int[geciciSet.size()]; // eski array'e yeni boyut tanimladik ( 6 uzunlugunda ve bos)

        // Set'deki benzersiz hale getirilen elementleri geciciArr'ye tasiyalim

        int index=0;
        for (Integer each:geciciSet
             ) {

            arr[index]=each;
            index++;
        }

        System.out.println(Arrays.toString(arr));

    }
}
