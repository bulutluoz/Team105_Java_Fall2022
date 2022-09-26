package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        // Kullanicidan ismini alip, buyuk harflerle yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz");

        String kullaniciAdi= scan.next();

        System.out.println(kullaniciAdi.toUpperCase());
    }
}
