package ders30_encapsulation;

public class C01_Encapsulations {
    public static void main(String[] args) {

        AEncapsuleClass pers1= new AEncapsuleClass();

        //pers1.hastaneIsmi="Java Hastanesi";  private oldugu icin gorulemez

        // pers1.hastaUcreti=10000; private oldugu icin kullanilamaz

        //pers1.hemsireAdresi="Ankara"; private oldugundan ulasilamaz
        // pers1.hemsireIsmi="Yildiz Yildiz";

        System.out.println(pers1.getHastaneIsmi()); // Yildiz Hastanesi

        pers1.setHastaUcreti(500);

        // getter ve setter method'lari
        // bazen de erisimi sinirlandirmak icin degil
        // kullanicilarin islevi iyi anlamasi icin kullanilir

        System.out.println(pers1.getHemsireAdresi());
        pers1.setHemsireAdresi("Istanbul");
        System.out.println(pers1.getHemsireIsmi());
    }
}
