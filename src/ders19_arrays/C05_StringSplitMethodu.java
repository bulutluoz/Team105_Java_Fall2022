package ders19_arrays;

import java.util.Arrays;

public class C05_StringSplitMethodu {

    public static void main(String[] args) {

        String str= "java gercekten cok cok guzel";
        // verilen str'da kac tane e harfi oldugunu bulunuz


        String[] eArrayi=str.split("e");

        System.out.println(Arrays.toString(eArrayi)); // [java g, rc, kt, n cok cok guz, l]
        System.out.println(eArrayi.length); // 5

        System.out.println("Metindeki e sayisi : " + (eArrayi.length-1));


        // 2.yontem
        // String'i "" ile split yaparak karakterlerine ayiralim

        String[] tumKarakterlerArr= str.split("");
        System.out.println(Arrays.toString(tumKarakterlerArr));
        // [j, a, v, a,  , g, e, r, c, e, k, t, e, n,  , c, o, k,  , c, o, k,  , g, u, z, e, l]

        int sayac=0;
        // bir loop ile tum karakterleri kontrol edelim

        for (int i = 0; i <tumKarakterlerArr.length ; i++) {

            if (tumKarakterlerArr[i].equals("e")){
                sayac++;
            }

        }
        System.out.println("Metindeki e sayisi : " + sayac);
    }
}
