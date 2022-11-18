package ders39_abstractClass;

public abstract class BHonda extends Araba{
    // Abstract bir class'i parent edindigimizde
    // iki alternatifimiz olur
    // 1- Parent'imiz olan abstract class'daki abstract method'lari override etmek
    // 2- proje yapimiz gerektiriyorsa bu class'i da abstract yapmak

    public void marka(){
        System.out.println("marka : Honda");
    }

    public abstract void yakit();

    public abstract void guvenlik();

    public void ozelTeknoloji(){
        System.out.println("Tum Honda arabalar vtec teknolojisi kullanir");
    }
}
