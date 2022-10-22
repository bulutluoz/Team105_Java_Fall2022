package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_OrtalamaninUstundekiNotsayisi {

    public static void main(String[] args) {

        // Ogretmenden ogrenci notlarini alip bir list olusturun
        // ogretmen 100'den buyuk bir sayi girip, bitirdiginde
        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin

        List<Double> notlar= listeOlustur();

        System.out.println(notlar);

        raporla(notlar);


    }

    public static void raporla(List<Double> notlar) {
        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin

        int ogrenciSayisi=notlar.size();
        double notlarToplami=0.0;
        double sinifNotOrtalamasi=0.0;
        int ortalamaUstundekiOgrenciSayisi=0;

        // notlar toplamini bulalim

        for (int i = 0; i <notlar.size() ; i++) {

            notlarToplami += notlar.get(i);
        }

        // not ortalamasini bulalim

        sinifNotOrtalamasi=notlarToplami/ogrenciSayisi;

        // ortalama ustundeki ogrenci sayisini bulalim

        for (int i = 0; i <notlar.size() ; i++) {

            if (notlar.get(i)>sinifNotOrtalamasi){
                ortalamaUstundekiOgrenciSayisi++;
            }
        }

        // rapor icin istenenleri yazdiralim
        System.out.print("Girilen not sayisi : " + ogrenciSayisi +
                            "\nGirilen notlarin ortalamasi : " + sinifNotOrtalamasi +
                            "\nOrtalama uzerinde not alan ogrenci sayisi : " + ortalamaUstundekiOgrenciSayisi);

    }

    public static List<Double> listeOlustur(){

        List<Double> notlar= new ArrayList<>();

        Scanner scan= new Scanner(System.in);
        Double girilenNot=5.0;


        while (girilenNot<=100){

            System.out.println("Lutfen listeye eklemek icin not giriniz" +
                    "\nBitirmek icin 100'den buyuk bir sayi yazin");
            girilenNot= scan.nextDouble();

            if (girilenNot<=100){
                notlar.add(girilenNot);
            }

        }

        return notlar;
    }
}
