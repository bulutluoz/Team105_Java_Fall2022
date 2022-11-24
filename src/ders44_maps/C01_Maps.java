package ders44_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapDepo.ornekMapOlustur();

        System.out.println(ogrenciMap);
        /*
           {
           101=Ali-Can-10-H-MF,
           102=Veli-Cem-11-M-Soz,
           103=Ali-Cem-11-H-TM,
           104=Ayse-Can-10-H-MF,
           105=Ayse-Cem-11-M-TM,
           106=Fatma-Han-10-K-Soz}
         */

        System.out.println(ogrenciMap.get(104)); // Ayse-Can-10-H-MF
        // 104 degerindeki key'in value'sunu döndürür

        // 105 numarali ogrencinin isim ve soyismini yazdirin
        int ogrenciKey=106;

        String isimSoyisim= MapDepo.isimSoyisimDondur(ogrenciMap,ogrenciKey);
        System.out.println(ogrenciKey + " nolu ogrenci isim ve soyismi : " + isimSoyisim);
    }
}
