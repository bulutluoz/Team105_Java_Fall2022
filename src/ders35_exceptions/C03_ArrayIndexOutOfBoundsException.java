package ders35_exceptions;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C03_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        // Kullanicidan bir index isteyin
        // verilen bir array'den kullanicinin girdigi index'deki element'i yazdirin



        int[] arr = {3,4,6,7,8,2,3,5,6,8,9,1};

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir index giriniz");
        int index= scan.nextInt();

        try {

            System.out.println(arr[index]);

        } catch (ArrayIndexOutOfBoundsException hata) {

            // System.out.println(hata.getMessage()); // Index 56 out of bounds for length 12
            // hata.printStackTrace();
            // java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 12
            //	at ders35_exceptions.C03_ArrayIndexOutOfBoundsException.main(C03_ArrayIndexOutOfBoundsException.java:21)
            // java'nin yazdigi tum hata mesajini verir ama kodlar calismaya devam eder

            // catch blogunda hicbir kod olmasa da kodlarimiz normal calismaya devam eder
            // catch blogun'da kullaniciya yazdiracagim mesaj
            // tamamen kod yaznin insiyatifindedir
            // exception class'indan hazir hata mesajlari da yazdirabilir
            // kendi istedigi kodlari da calistirabilir
            // hic bir sey yazmaya da bilir.
        }

    }
}
