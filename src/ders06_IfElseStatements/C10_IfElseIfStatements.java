package ders06_IfElseStatements;

public class C10_IfElseIfStatements {

    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        char cinsiyet='k';
        int yas= 60;

        if (cinsiyet=='E' && yas>=65){
            System.out.println("emekli olabilirsin");
        } else if (cinsiyet=='E' && yas<65 && yas>15) {
            System.out.println("Emekli olmak icin daha " + (65-yas) + " sene calismalisin");
        } else if (cinsiyet=='K' && yas>=60) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='K' && yas<60 && yas>15) {
            System.out.println("Emekli olmak icin daha " + (60-yas) + " sene calismalisin");
        }else{
            System.out.println("gecersiz giris");
        }

    }


}
