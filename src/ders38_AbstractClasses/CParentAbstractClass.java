package ders38_AbstractClasses;

public abstract class CParentAbstractClass {

    /*
      Abstract bir class abstract method'lara sahip olabilir
      Bir class'i abstract yapmak icin class declaration'ina abstract keyword eklenmelidir

     */

    public abstract void mecburiMethod1();

    public abstract void mecburiMethod2();
    // soyut(abstract) method'larin body'si olmaz

    public String concreteMethod(){
        // Bugune kadar kullandigimiz normal method'lara
        // soyut olmayan method demek yerine concrete method denir
        return "";
    }


    /*
       Bir parent class'da child class'larin mutlaka override edecegi bir method olusturdugumuzda
       method body'si gereksizlesir
       cunku hic calismayacaktir

       1- abstract parent class'dan obje olusturulamayacagi icin objeler icin bu method kullanilamaz
       2- child class'lar da mecburen bu method'u override edeceklerinden,
          bu method'larin body'si asla KULLANILMAYACAKTIR

       Java hic kullanilmayacak bu method body'leri yazmamamiza imkan tanimistir


     */

    // Child class'larin mutlaka override etmesini istedigimiz method'lari
    // abstract olarak tanimlar ve bodys'siz olarak olustururuz.
}
