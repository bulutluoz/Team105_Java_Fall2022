package ders40_Interfaces;

public interface I08_InterfaceStaticVeDefaultMethods {

    /*
        java 8 ile Developer'larin talebi uzerine yeni bir istisnai durum java'ya eklenmistir

        bir interface'i yillar icerisinde yuzlerce class inherit etmis olabilir
        sonradan interface'e eklenen bir abstract method, tum eski child'lar tarafindan
        inherit edilmelidir, aksi takdirde tum eski child class'lar CTE verecektir.

        Java 8 ile birlikte Java, interface'lere default veya static ile isaretlenmmek
        sarti ile body'si olan method eklenmesine izin vermistir.
        Bu sayede interface'e sonradan eklenen method body'si oldugu icin
        override edilmek zorunda DEGILDIR


        Interface icerisinde body'si olan method olusturmak icin kullanilan
        default ve static keyword'leri arasinda tek bir fark vardir

        default kullanilan method'lar obje olusturularak cagrilabilirken
        static olarak isaretlenen method'lar direk kullanilabilir

     */

    void method1();
    void method2();

    // interface'deki tum methodlar public ve abstractir
    // biz interface'deki bir method deklarasyonuna default yazarsak
    // bu access modifier degildir



    public default void method3(){
        System.out.println("interface icindeki body'li default method");
    }

    public static void method4(){
        System.out.println("Interface icindeki body'li static method");
    }
}
