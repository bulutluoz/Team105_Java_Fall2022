package ders41_iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {

    public static void main(String[] args) {

        // Java collections icerisindeki bazi class'lar index desteklemez
        // Bu durumda index kullanmadan collection icerisindeki tum elementlere ulasabilmek
        // ve onlari update edebilmek icin farkli ihtiyaclarimiz olur

        // List<> index yapisini destekledigi icin, boyle bir ihtiytac duymaz
        // ancak bugunluk index kullanmadan list' elementlerine ulasmaya
        // ve onlari update etmeye calisalim


        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // index kullanmadan list'in tum elementlerini yazdirin
        for (Integer each: sayilar
             ) {
            System.out.print(each + " ");
        }
        System.out.println("");
        // index kullanmadan list'in elementleri 1'er artirin
        // index kullanmadan 25'den buyuk sayi'lari list'den silin

        for (Integer each: sayilar
             ) {
            System.out.print(each+1 + " ");
        }
        System.out.println("");
        System.out.println(sayilar); // [10, 20, 30, 40]

        for (Integer each: sayilar
             ) {
            each+=1;
            System.out.print(each + " ");
        }

        System.out.println("");
        System.out.println(sayilar); // [10, 20, 30, 40]


        /*
           Index kullanmadan list'in elemanlarini kalici olarak degistirmek mumkun olmadi
           Java bunun icin Iterator interface'i olusturmustur
         */

    }
}
