package ders47_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;

public class C01_putIfAbsent {

    public static void main(String[] args) {

        Map<String,Integer> mp1= new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);


        System.out.println(mp1.putIfAbsent("D", 9)); // null
        System.out.println(mp1); // {A=5, B=3, C=7, D=9}

        System.out.println(mp1.putIfAbsent("D", 15)); // 9
        System.out.println(mp1); // {A=5, B=3, C=7, D=9}

        /*
            putIfAbsent(K,V)    eger K daha once yoksa ekler ve null doner
                                eger K daha once varsa, eklemek istedigimiz yeni degeri eklemez
                                       ve eski var olan degeri bize dondurur
         */



        Map<Integer,String> mp2 =new HashMap<>();

        mp2.put(2,"S");
        System.out.println(mp2.putIfAbsent(3, "K")); // null
        System.out.println(mp2); // {2=S, 3=K}

        System.out.println(mp2.putIfAbsent(3, "Z")); // K
        System.out.println(mp2); // {2=S, 3=K}



    }
}
