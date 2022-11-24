package ders44_maps;

import java.util.HashMap;
import java.util.Map;

public class MapDepo {

    // ogrenci map olusturup bize donduren bir method olusturun

    public static Map<Integer, String> ornekMapOlustur(){
        Map<Integer,String> ogrenciMap= new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-H-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Ayse-Cem-11-M-TM");
        ogrenciMap.put(106,"Fatma-Han-10-K-Soz");

        return ogrenciMap;
    }

    public static String isimSoyisimDondur(Map<Integer, String> ogrenciMap, int ogrenciKey) {
       /*
           {
           101=Ali-Can-10-H-MF,
           102=Veli-Cem-11-M-Soz,
           103=Ali-Cem-11-H-TM,
           104=Ayse-Can-10-H-MF,
           105=Ayse-Cem-11-M-TM,
           106=Fatma-Han-10-K-Soz}

           ogrenciKey=105
         */

        String ogrenciValue= ogrenciMap.get(ogrenciKey); // "Ayse-Cem-11-M-TM"

        String[] valueArr=ogrenciValue.split("-"); // [Ayse, Cem, 11, M, TM]

        String isimSoyisim= valueArr[0]+" "+valueArr[1]; // Ayse Cem

        return isimSoyisim;
    }
}
