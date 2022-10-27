package ders25_staticKeyword;

public class AHemsire {

    static String hastaneIsmi="Yildiz Hastanesi";
    static String hastaneAdresi="Cankaya / Ankara";
    static String bashekimIsmi="Dr Mehmet Yilmaz";

    String personelIsim="Isim belirtilmedi";
    String personelAdresi="Adres belirtilmedi";
    String personelTelefon="Telefon belirtilmedi";
    @Override
    public String toString() {
        return "AHemsire{" +
                "personelIsim='" + personelIsim + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                ", \nhastaneIsmi='" + hastaneIsmi + '\'' +
                ", hastaneAdresi='" + hastaneAdresi + '\'' +
                ", bashekimIsmi='" + bashekimIsmi + '\'' +
                '}';
    }






















}
