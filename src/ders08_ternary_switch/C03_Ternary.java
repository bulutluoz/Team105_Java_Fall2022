package ders08_ternary_switch;

public class C03_Ternary {

    public static void main(String[] args) {

        int a= 5;
        /*
        Ternary operatoru tek basina kullanilamaz
        ternary bize bir sonuc uretir
        bu sonucu ya direk yazdirmali veya bir variable'a atamaliyiz
         */
        String sonuc =a%2==0 ? "cift sayi" : "tek sayi";

        /*
          ternary'nin sonucunu bir variable'a atayacaksak
          true ve false durumlarinda uretilecek sonucun
          ayni data turune uygun olmasi gerekir.
          aksi halde CTE olusur

          ama ternary'i sout icinde kullanirsak
          sonuclarin data turunun ayni olmasi sart olmaz
         */

        String sonuc2= a>10 ? "buyuk sayi" : ""+2*a ; // CTE vermemesi icin String'e cevirdik

        System.out.println(a>10 ? "buyuk sayi" : 2*a);
    }
}
