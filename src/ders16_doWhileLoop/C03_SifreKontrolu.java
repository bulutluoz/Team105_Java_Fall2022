package ders16_doWhileLoop;

import java.util.Scanner;

public class C03_SifreKontrolu {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan bir sifre girmesini isteyin.
        Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
	    Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin
	    ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
		- Sifre kucuk harf icermelidir
		- Sifre buyuk harf icermelidir
		- Sifre ozel karakter icermelidir
		- Sifre en az 8 karakter olmalidir.
           SADECEa54
         */

        Scanner scan = new Scanner(System.in);
        String sifre;
        int bayrak;
        boolean sifreDogruMu;

        do{
            System.out.println("Lutfen bir sifre giriniz");
            sifre= scan.nextLine();
            // tum hatalari soylemesini istiyorsak
            // bagimsiz if cumleleri ve bayrak kullanmak zorundayiz
            bayrak=0;
            int sonuc = kucukHarfKontroluYap(sifre);
            // kucuk harf kontrolu yapan bir method olusturalim
            // kucuk harf varsa 1, yoksa 0 dondursun
            bayrak = bayrak+sonuc;

            // - Sifre buyuk harf icermelidir

            sonuc= buyukHarfKontroluYap(sifre);
            // buyuk harf kontrolu yapan bir method olusturalim
            // buyuk harf varsa 1, yoksa 0 dondursun

            bayrak=bayrak+sonuc;

            // - Sifre ozel karakter icermelidir
            sonuc=ozelKarakterKontroluYap(sifre);
            bayrak=bayrak+sonuc;

            // - Sifre en az 8 karakter olmalidir.

            if (sifre.length()<8){
                System.out.println("sifre en az 8 karakter olmalidir");
            } else {
                bayrak++;
            }

            // bayrak 4 ise sifre tamam, degilse hata vardir
        }while(bayrak != 4);
        System.out.println("Sifreniz basari ile kaydedildi");
    }

    public static int ozelKarakterKontroluYap(String sifre) {
        int bayrak=0;
        String ozelKarakterler = "§±@!$%^&*()_-+=?/>.<,`~#";
        // sifre ozel karakter icermelidir
        // bunun icin tum harfleri kontrol edecek bir for loop olusturmaliyim
        // eger sifrenin karakterlerinden bir tanesini ozelKarakterler Stringi iceriyorsa
        // bizim icin yeterli olur

        for (int i = 0; i < sifre.length(); i++) {
            if (ozelKarakterler.contains(sifre.substring(i,i+1))){
                bayrak++;
                break;
            }
        }
        // bayrak==0 ise ozel karakter yoktur, yani bir hata var bunu yazdiralim
        if (bayrak==0){
            System.out.println("Sifre ozel karakter icermelidir");
            return 0;
        }else return 1;
    }

    public static int buyukHarfKontroluYap(String sifre) {

        int bayrak=0;
        // Sifre kucuk harf icermelidir
        // bunun icin tum harfleri kontrol edecek bir for loop olusturmaliyim
        // 1 tane kucuk harf bulmam yeterli olacak
        for (int i = 0; i <sifre.length() ; i++) {

            if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z'){
                bayrak++;
                break;
            }
        }

        // bayrak==0 ise kucuk harf yoktur, yani bir hata var bunu yazdiralim
        if (bayrak==0){
            System.out.println("Sifre buyuk harf icermelidir");
            return 0;
        }else return 1;
    }

    public static int kucukHarfKontroluYap(String sifre) {
        int bayrak=0;
        // Sifre kucuk harf icermelidir
        // bunun icin tum harfleri kontrol edecek bir for loop olusturmaliyim
        // 1 tane kucuk harf bulmam yeterli olacak
        for (int i = 0; i <sifre.length() ; i++) {

            if (sifre.charAt(i)>='a' && sifre.charAt(i)<='z'){
                bayrak++;
                break;
            }
        }

        // bayrak==0 ise kucuk harf yoktur, yani bir hata var bunu yazdiralim
        if (bayrak==0){
            System.out.println("Sifre kucuk harf icermelidir");
            return 0;
        }else return 1;
    }
}
























