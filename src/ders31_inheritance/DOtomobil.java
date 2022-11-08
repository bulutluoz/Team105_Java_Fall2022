package ders31_inheritance;


public class DOtomobil extends BinekArac{

    public static void main(String[] args) {
        DOtomobil oto1=new DOtomobil();
        System.out.println(oto1.marka);

        // Inheritance sayesinde bir Child class olusturdugumuzda
        // yeni hicbir variable veya method olusturmadan
        // parent clas(lar)'daki tum ozellikleri almis oluruz
        // Child class'da parent'dan gelen ozellikleri
        // update edebilir veya yeni ozellikler ekleyebiliriz



    }
}
