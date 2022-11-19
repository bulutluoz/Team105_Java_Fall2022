package ders40_Interfaces;

public class I07_ConcreteChildOf2Interfaces implements I05_Interface,I06_Interface{

    /*
       1- Bir class sadece bir class'a extends edilebilir
          ancak birden fazla interface'e implements edilebilir
       2- Concrete child class implement ettigi
          tum interface'lerdeki abstract method'lari override etmek zorunda oldugundan
          iki interface'deki tum method'lari override etmek gerekir
          - iki interface de ayni isimde ve ayni return type'a sahip
            method'lardan hangisini override ettigi onemli degildir
          - ancak isimler ayni return type'lar farkli oldugunda
            iki interface'i birden implement etmemiz mumkun olmayacaktir
            bu durumda
               * ) ya child class'dan bu iki interface'i implements etmekten vazgecmelisiniz
               * ) veya sisteme mudahale imkaniniz varsa bu conlict'i cozmelisiniz
        3- Child class'dan parent Interface'lerdeki variable'lari kullanmak istersek
           - ayni isimde iki interface'de de variable varsa,
             interfaceIsmi.variableIsmi seklinde tercihinizi belirtmelisiniz
           - kullanacagimiz variable sadece 1 interface'de varsa
             sadece variableismi yazmak yeterli olacaktir

     */
    public static void main(String[] args) {

        System.out.println(I06_Interface.MESAJ);
        System.out.println(I05_Interface.SAYI);
        System.out.println(SAYI2);
    }

    @Override
    public void method1() {

    }

    @Override
    public String method2() {
        return null;
    }

    @Override
    public int method4() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
