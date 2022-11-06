package ders30_encapsulation;

public class EChild extends DParent{

    /*
      java'daki inheritance'in insanlardan en buyuk farki :
       insanlarda parent child edinebilir ama child parent'ini secemez
       Java'da ise tam tersidir
       - Siz bir class olusturdugunuzda daha once olusturulmus class'lardan
         tum ozelliklerini inherit etmek istediginiz class'i PARENT EDINIRSINIZ

       Bir class baska bir class'i inherit etmek istediginde
       extends keyword ile bunu deklare eder
     */

    public static void main(String[] args) {

        EChild child1= new EChild();

        child1.yas=30;
        child1.isim="Mahmut";
        child1.isEnough=false;



    }
}
