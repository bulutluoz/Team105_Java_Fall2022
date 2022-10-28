package ders26_passByvalue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByvalueList2 {

    public static void main(String[] args) {

        // Bir method olusturalim
        // method'da yeni bir liste olusturun
        // listeye sayilar listesindeki degerlerin 5 fazlasini element olarak atayin
        // sonra sayilar listesine deger olarak yeni list'i atayin
        // ve sayilar list'ini yazdirin

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        yeniListDegeriAta(sayilar);

        System.out.println("method call'dan sonra main method'da sayilar list : " + sayilar);

    }

    public static void yeniListDegeriAta(List<Integer> sayilar){
        // Bir method olusturalim
        // method'da yeni bir liste olusturun
        List<Integer> yeniList= new ArrayList<>();
        // listeye sayilar listesindeki degerlerin 5 fazlasini element olarak atayin

        for (int i = 0; i < sayilar.size(); i++) {
            yeniList.add(sayilar.get(i)+5);
        }
        // sonra sayilar listesine deger olarak yeni list'i atayin
        sayilar=yeniList;
        // ve sayilar list'ini yazdirin

        System.out.println("method'da sayilar listesinin son hali : " + sayilar);
    }
}
