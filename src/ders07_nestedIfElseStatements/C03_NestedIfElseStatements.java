package ders07_nestedIfElseStatements;

public class C03_NestedIfElseStatements {

    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        char cinsiyet= 'K';
        int yas=56;

        // nested if-else seklinde kullanim icin once ana degiskeni secip
        // ona gore ana yapiyi olusturalim
        // cinsiyet ana degisken olsun

        if (cinsiyet=='k' || cinsiyet=='K'){
            // giris yapilan deger bir kadina ait demektir
            if (yas<15){
                System.out.println("Hatali yas girisi");
            } else if (yas<60) {
                System.out.println("Emekli olamazsin, daha " +(60-yas) +" yil calismalisin");
            }else {
                System.out.println("Emekli olabilirsin");
            }

        } else if (cinsiyet=='e' || cinsiyet=='E') {
            // giris yapilan deger bir erkege ait
            if (yas<15){
                System.out.println("Hatali yas girisi");
            } else if (yas<65) {
                System.out.println("Emekli olamazsin, daha " +(65-yas) +" yil calismalisin");
            }else {
                System.out.println("Emekli olabilirsin");
            }

        }else{
            System.out.println("Yanlis cinsiyet girisi");
        }


    }
}
