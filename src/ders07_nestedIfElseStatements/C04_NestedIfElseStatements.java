package ders07_nestedIfElseStatements;

import java.util.Scanner;

public class C04_NestedIfElseStatements {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        // ana degisken yas olsun



        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();

        System.out.println("Lutfen cinsiyeti giriniz E/K");
        char cinsiyet= scan.next().charAt(0);

        if (yas<15){
            System.out.println("Hatali yas girisi");
        } else if (yas<60) {
            // emekli olamaz, calismasi gereken sure cinsiyete bagli
            System.out.println("emekli olamazsin");
            if (cinsiyet=='K' || cinsiyet=='k'){
                System.out.println("daha "+ (60-yas)+ " sene calismalisin");
            } else if (cinsiyet=='E' || cinsiyet=='e') {
                System.out.println("daha "+ (65-yas)+ " sene calismalisin");
            }else{
                System.out.println("hatali cinsiyet girisi");
            }

        } else if (yas<65) {
            // kadin ise emekli olabilir, erkek calismasi lazim
            if (cinsiyet=='K' || cinsiyet=='k'){
                System.out.println("emekli olabilirsin");
            } else if (cinsiyet=='E'|| cinsiyet=='e') {
                System.out.println("emekli olamk icin " + (65-yas)+ " yil daha calismalisin");
            }else {
                System.out.println("hatali cinsiyet girisi");
            }

        }else { // yas 65'den buyukse
            System.out.println("emekli olabilirsin");
        }


    }
}
