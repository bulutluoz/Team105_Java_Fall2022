package ders40_Interfaces;

public interface I01_Interface {

    // Interface'ler ozel yapi olduklarindan
    // yazilsa da yazilmasa da, tum variable'lar
    // public, static ve final'dir

    String MESAJ="Hello Interface";
    static int SAYI=20;
    public static boolean GUZEL_MI=true;
    public static final int SAYI2=30;


    // Ayni sekilde
    // tum method'lar public ve abstract'tir
    void method1();
    abstract int method2();
    public abstract String method3();

}
