package ders33_inheritanceDataTypeKullanimi_overriding;

public class EKuslar extends DHayvanlar{
    protected void kanat( ) {
        System.out.println("Kuslar kanatlidirlar");
    }
    protected void solunum( ) {
        System.out.println("Kuslar akcigerle nefes alirlar");
    }
    protected void gaga( ) {
        System.out.println("Kuslarin gagalari vardir");
    }
    protected void cogalma( ) {
        System.out.println("Kuslar yumurtayla cogalirlar");
    }

}
