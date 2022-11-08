package ders31_inheritance;

public class GCorolla extends FToyota{

    String model= "Corolla";
    String uretimYeri="Turkiye";

    GCorolla(){
        super();
        System.out.println("Corolla cons. calisti");
    }

    public static void main(String[] args) {

        GCorolla corolla1= new GCorolla();
        System.out.println(corolla1.marka); // Toyota

        /*
          Bir child class'dan obje olusturdugumuzda
          olusturulan obje sadece child class'a ait ozellikleri degil
          tum parent class'l;arindaki ozellikleri de tasir.

          Bir objenin bir class'in ozelliklerini tasimasi icin
          o obje olusturulurken class'a ait constructor'in calismis olmasi gerekir
          Yani child class'indaki obje olusturulurken
          tum parent class'lardaki constructor'lar da otomatik olarak calisir

          java bu islem icin soyle bir mekanizma gelistirmistir.
          Bir class olusturdugumuzda biz constructor olusturmasak da
          Java'nin o class'a default constructor koydugu GIBI
          extends keyword kullanan bir class'da olusturulan her bir constructor'in
          ilk satirina biz gormesek de super() constructor call koyar.
         */

    }

}
