package ders30_encapsulation;

public class AEncapsuleClass {
    private String hastaneIsmi="Yildiz Hastanesi";

    public void setHastaUcreti(int hastaUcreti) {
        this.hastaUcreti = hastaUcreti;
    }

    public String getHastaneIsmi() {
        return hastaneIsmi;
    }

    // hastane ismi gorulebilsin ama degistirilemesin
    // getter method'u lazim
    private int hastaUcreti;
    // hasta ucretleri de giris yapilabilsin ama
    // ucreti sigortadan alinacagi icin
    // personel hasta ucretlerini goremesin
    // setter method'u lazim

    private String hemsireIsmi;
    private String hemsireAdresi;
    // bu instance variable'lara herkes ulasabilsin
    // bu durumda public yapmak akla gelen ilk cozum olacaktir
    // bu variable'lari public yapmak yerine
    // private yapip, getter ve setter olusturmak da
    // ayni islevi gorur


    public String getHemsireIsmi() {
        return hemsireIsmi;
    }

    public void setHemsireIsmi(String hemsireIsmi) {
        this.hemsireIsmi = hemsireIsmi;
    }

    public String getHemsireAdresi() {
        return hemsireAdresi;
    }

    public void setHemsireAdresi(String hemsireAdresi) {
        this.hemsireAdresi = hemsireAdresi;
    }
}
