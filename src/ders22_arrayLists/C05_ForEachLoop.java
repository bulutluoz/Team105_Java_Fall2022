package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_ForEachLoop {

    public static void main(String[] args) {
        //Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        //	- Kelimenin uzunlugu cift sayi ise ilk yarisini
        //	- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //	yeni bir listeye ekleyip yazdirin.

        String[] arr = {"Sumeyra","Mehmet","Ekrem","Yilmaz","Ayse"};
        List<String> yeniList = new ArrayList<>();

        for (String each: arr
             ) {

            if (each.length() %2==0){ // uzunlugu cift

                yeniList.add(each.substring(0,each.length()/2));

            }else { // uzunlugu tek

                yeniList.add(each.substring((each.length()-1)/2));
            }
        }

        System.out.println(yeniList);
    }
}
