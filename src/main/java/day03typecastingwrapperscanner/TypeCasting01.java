package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type Casting: Bir numeric data type'ini diger numeric data type'ine cevirmek demektir.
    //           byte < short < int < long < float < double
    //             Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir.
    //             Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir.


    public static void main(String[] args) {

         byte age = 23;      // AUTO WİDENİNG
         int newAge = age;


         long population = 1234;        //EXPLİCİT NARROWİNG
         int newPopulation = (int)population;

         //Example 1: short'u double'a çeviren kodu yaziniz.
         // Example 2 : float'i byte yapan kodu yaziniz.

        short village = 30000; //Auto Widening
        double newVillage = village;

        float price = 12.99F;//Explicit Narrowing
        byte newPrice = (byte)price;

        System.out.println(newPrice);//12(Java ondalik sayiyi tam sayiya cevirirken yuvarlama islemi yapmaz.
                                     //Java ondalik sayiyi , tam sayiya cevirirken ondalik kismini siler.

        int number = 515;

        byte newNumber = (byte)number;

        System.out.println(newNumber);//3 ==> Java 515'i 256'ya boldu kalani return etti.

        int num = 510;

        byte newNum = (byte)num;

        System.out.println(newNum);//-2

    }
}
