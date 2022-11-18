package ders39_abstractClass;

public class CHondaCivic extends BHonda{


    @Override
    public void motor() {
        System.out.println("Honda Civic araclar vtec teknolojili cevreci kullanir");
    }

    @Override
    public void kasa() {
        System.out.println("Civic sedan veya hb kasa kullanir");
    }

    @Override
    public void tekerlek() {
        System.out.println("civic araclar 205x16x55 teker kullanir");
    }

    @Override
    public void yakit() {
        System.out.println("Civic araclar benzinlidir");
    }

    @Override
    public void guvenlik() {
        System.out.println("Civic araclar guvenlik standardina uyar");
    }

    @Override
    public void abs() {
        System.out.println("Honda Civic arabalar standart olarak abs kullanir");
    }

    @Override
    public void klima() {
        System.out.println("Honda Civic arabalar standart olarak klima kullanir");
    }

    public static void main(String[] args) {

        /*
           Abstract parent class'lardaki abstract method'lar
           concrete child class'lar tarafindan mecburen override edilir

           Ancak abstract parent'lardaki concrete method'lari
           override etmek mecburi degildir
           Eger child class'a uyarlamak isterseniz override edebilirsiniz
           veya override etmeyip parent class'daki haliyle kullanabilirsiniz
         */
        CHondaCivic civic1=new CHondaCivic();
        civic1.abs(); // Civic
        civic1.klima();// Civic
        civic1.marka(); // Honda
        civic1.ozelTeknoloji(); // Honda
    }
}
