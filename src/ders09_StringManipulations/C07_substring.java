package ders09_StringManipulations;

public class C07_substring {
    public static void main(String[] args) {

        String str= "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5, 8)); // gun
        // 5.indexden baslar (8-5) karakter yazdirir
        // 5.index dahil (inclusive) , 8.index haric(exclusive)

        // gectikce yazdirin

        System.out.println(str.substring(9,17)); // gectikce

        System.out.println(str.substring(3,7)); // a gu

        String isim= "huseYIN";
        // verilen ismi ilk harfi buyuk, geriye kalanlar kucuk harf olarak kaydedin

        isim = isim.substring(0,1).toUpperCase()+ // ilk harfi alip buyuk harf yaptik
               isim.substring(1).toLowerCase(); // 1.index ve sonrasini alip kucuk harf yaptik

        System.out.println(isim); // Huseyin

        System.out.println(isim.substring(2,5)); // sey

        // sadece 3. indexdeki harfi yazdirin e
        System.out.println(isim.substring(3,4)); // e

        System.out.println("zor sorunun cevabi : " + isim.substring(2,2)); // "" hiclik yazdirir

        // System.out.println(isim.substring(5,2)); // StringIndexOutOfBoundsException



    }
}
