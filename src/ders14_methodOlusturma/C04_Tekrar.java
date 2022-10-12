package ders14_methodOlusturma;

public class C04_Tekrar {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        // bu iki sayinin carpim sonucunu yeni kod yazmadan konsola yazdirin
        System.out.println(C01_Carpim.carpimMethodu(a, b)); // 200.0

        String c="Nasil";
        String d="yani?";
        // Bu iki String'i aralarinda bir bosluk birakarak yazdirin
        System.out.println(C02_StringConcate.birlestirMethodu(c, d)); // Nasil yani?

        String e= "Bu da mi oldu?";
        // e String'ini tersten yazdirin
        System.out.println(C03_StringTerseCevirme.stringiTerseCevir(e));


        // "Bu cumleyi terse cevirin"

        System.out.println(C03_StringTerseCevirme.stringiTerseCevir("Bu cumleyi terse cevirin"));


        String str="Java cok guzel";
        // str'i buyuk harf olarak yazdirin

        System.out.println(str.toUpperCase());

    }
}
