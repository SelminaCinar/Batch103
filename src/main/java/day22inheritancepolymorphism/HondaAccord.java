package day22inheritancepolymorphism;

public class HondaAccord extends Honda {
    /*
    1)Siz Class olusturdugunuzda Java otomatik olarak size gorunmez bir constructer verir,
    cunku Java, Class'in kalip oldugunu ve Object olusturmak icin yaratildigini ve Object olusturmak icin
    constructor'in sart oldugunu bilir.
    2)Java'nin otomatik olarak olusturdugu bu gorunmez constructor'a "default constructor" denir.
    3)Siz kendiniz herhangi bir constructor olusturdugunuzda Java "default constructor'i siler.
    4)Bir class'ta birden fazla constructor olabilir.Fakat bu constructor'larin parametreleri farklı
    olmalidir.
    5)"this" keyword "Bu Class" anlamindadir. " this price" demek bu Classtaki "price" isimli vaariable demektir.
       "this.price" syntaxi constructor'larin icinde kullanilir.
    6)Constructor kullanarak variable'larin uzerinde yaptiginiz degisimler sadece Object uzerinde
      variable'larin degerlerini degistirir.
      Classtaki variable degerlerini degistiremez.

     */

    public int price;
    public int year;
    public String make;
    public String model;

    public HondaAccord() {

    }

    public HondaAccord(int price) {
        this.price = price;
    }

    public HondaAccord(int price, int year) {

        this.price = price;
        this.year = year;
        System.out.println("Honda Accord Constructor");

    }

    public HondaAccord(int price, int year, String make, String model) {
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;

    }
}

