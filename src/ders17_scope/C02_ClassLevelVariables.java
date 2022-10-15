package ders17_scope;

public class C02_ClassLevelVariables {

    // class level variable'lar method'larin disinda olusturulur
    // genel kullanim en ustte olusuturulmalaridir.
    static String hastaneismi="Yildiz hastanesi";
    static int hastaSayisi= 23453;
    static String basHekimIsmi;
    String persIsmi="Isim girilmedi";
    String persTelefonu="Telefon girilmedi";
    int persYasi;


    public static void main(String[] args) {
        System.out.println(hastaneismi); // Yildiz hastanesi
        System.out.println(basHekimIsmi); // null
        //System.out.println(persIsmi); // static olmadigi icin static main method'dan kullanilamaz
        /*
         Class level variabler'a deger atamasi yapilmamis olursa
         Java bu variable'lara data turune gore
         default olarak tanimlanan degerleri atar
         default degerler
         sayisal variable'lar : 0
         boolean : false
         char : ''
         Objeler (String dahil) : null
         */
    }


    public static void method1(){
        System.out.println(hastaSayisi);
        hastaSayisi++;
        // System.out.println(persIsmi);
    }

    public void method2(){
        System.out.println(hastaneismi); // Yildiz hastanesi
        hastaSayisi++;
        System.out.println(persIsmi); // Isim girilmedi
        System.out.println(persYasi); // 0
    }
}
