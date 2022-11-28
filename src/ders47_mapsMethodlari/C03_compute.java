package ders47_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;

public class C03_compute {
    public static void main(String[] args) {

        Map<String,Integer> mp1= new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);

        // C key olarak varsa degerini 3 artir

        if (mp1.containsKey("C")){

            mp1.put("C", mp1.get("C")+3);
        }

        System.out.println(mp1); // {A=5, B=3, C=10}

        // B key olarak varsa degerini 2 ile carp

        mp1.computeIfPresent("B", (k,v) -> 2*v );

        System.out.println(mp1); // {A=5, B=6, C=10}

        // "A" key olarak varsa degerini 5 azaltin

        System.out.println(mp1.computeIfPresent("A", (k, v) -> v - 5)); // 0

        System.out.println(mp1); //{A=0, B=6, C=10}

        // Map'de D yoksa valuse'su 11 olacak sekilde ekleyelim

        if (!mp1.containsKey("D")){

            mp1.put("D",11);
        }
        System.out.println(mp1); // {A=5, B=3, C=10, D=11}

        // E yoksa degeri 8 olarak ekleyelim

        mp1.computeIfAbsent("E", v->8);
        System.out.println(mp1); // {A=0, B=6, C=10, D=11, E=8}


        // E'nin degerini 4 artir

        mp1.compute("E", (k,v)-> v+4);
        System.out.println(mp1); // {A=0, B=6, C=10, D=11, E=12}


        mp1.compute("R", (k,v)-> v=3);
        System.out.println(mp1); // {A=0, R=3, B=6, C=10, D=11, E=12}



        mp1.compute("F", (k,v)-> v*3);  // NullPointerException
        System.out.println(mp1);


    }
}
