package ders46_maps;

import ders44_maps.MapDepo;


import java.util.Map;
import java.util.Set;

public class C01_EntrySet {

    public static void main(String[] args) {

        // onceki iki derste key(Set) ve value(Collection) degerlerini toplu olarak alabiliyorduk
        // ancak key ve value birlikte kullanmak istedigimizde
        // bu islemi yapmak zor olur

        // Bunun icin Java Entry Interface'ini olusturmustur
        // Entry'ler key=Value ikilisini 1 Entry olarak kabul ederler

        Map <Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
        System.out.println(ogrenciMap.size()); // 6

        ogrenciMap.put(108, "Mehmet-Erkan-12-K-MF");

        /*
            {
            101=Ali-Can-10-H-MF,
            102=Veli-Cem-11-M-Soz,
            103=Ali-Cem-11-H-TM,
            104=Ayse-Can-10-H-MF,
            105=Ayse-Cem-11-M-TM,
            106=Fatma-Han-10-K-Soz
            }
         */

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti =ogrenciMap.entrySet();
        System.out.println(ogrenciEntrySeti);
        /*
            [
            101=Ali-Can-10-H-MF,
            102=Veli-Cem-11-M-Soz,
            103=Ali-Cem-11-H-TM,
            104=Ayse-Can-10-H-MF,
            105=Ayse-Cem-11-M-TM,
            106=Fatma-Han-10-K-Soz
            ]
            aralarindaki farklar
            1- yukaridaki map, bu Set
            2- yukaridakinde {} kullaniyor, bu ise [ ]
            3- yukaridakinde key ve value'ler her eleman icin bir arada ama ayri ayri bireyler
               Entry'de ise K=V  ikisi birlikte bir element olusturuyor
         */

        // entry seti icerisindeki entry'leri biz de sira numarasi vererek yazdiralim

        int siraNo=1;

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
             ) {

            System.out.println(siraNo + "-   " + eachEntry);
            siraNo++;
        }

        // Entry'leri kullanarak Key'leri yazdirin
        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
             ) {

            System.out.println(eachEntry.getKey());
        }

        // Entry'leri kullanarak tum ogrencilerin siniflarini 1 artirin
        // 12. sinifta olan varsa, map'ten cikarin

        // tum entry'leri elden gecirelim
        String entryValue;
        String[] entryValueArr;
        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
             ) {
            // herbir entry'deki value'yu alip, parcalayip istenen update'i yapip,
            // yeniden map'e eklememiz lazim
            entryValue=eachEntry.getValue(); // Ali-Can-10-H-MF
            entryValueArr=entryValue.split("-"); // [Ali, Can, 10, H, MF]

            if (entryValueArr[2].equals("12")){
                // ogrencinin sinifi 12 ise
                eachEntry.setValue("Mezun oldu");

            }else{
                // ogrencinin sinifi 12 degilse
                int sinif=Integer.parseInt(entryValueArr[2]);
                sinif++;
                entryValueArr[2] = sinif+""; // [Ali, Can, 11, H, MF]

                eachEntry.setValue(entryValueArr[0]+"-"+
                                    entryValueArr[1]+"-"+
                                    entryValueArr[2]+"-"+
                                    entryValueArr[3]+"-"+
                                    entryValueArr[4]);
            }
        }

        System.out.println(ogrenciMap);

    }
}
