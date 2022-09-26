package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        // Kullanicidan ismini alip, buyuk harflerle yazdirin

        // 1.adim :  scan objesi olusturma
        Scanner scan = new Scanner(System.in);

        // 2.adim : kullaniciya ne istedigimizi yazdirma
        System.out.println("Lutfen adinizi giriniz");

        // 3.adim : kullanicidan istedigimiz bilginin turune uygun bir variable olusturup
        //          scanner method'larindan uygun olanini kullanarak alinan degeri
        //          variable'a atayalim

        String kullaniciAdi= scan.next();

        System.out.println(kullaniciAdi.toUpperCase());
    }
}
