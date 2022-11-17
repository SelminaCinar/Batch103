package day32maps;

public class StaticBlocks01 {


    static{
        System.out.println("static block 2");
    }
    public static double pi;
    //static block'lar ihtiyacimiz olan variablelarin class olusturma safhasinda elimizde
//    olmasini saglar.
//    static block'lar class icindeki herseyden once calistirilir."main method"dan ve diger tum
//    methodlardan once calistirilir.
//    static blocklar icinde sadece "static variable"lara deger atanabilir.
    //Birden fazla static block varsa ustteki once calistirilir.
    static{
        pi=3.14;
        System.out.println("static block 1");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }
}
