package day29abstractioncollections;

/*
1)Abstract methodlar sadece ne yapilacagini soyler(what to do)
2)"concrete method"lar ne yapilacagi ile birlikte nasil yapilacagini(how to do ) da soyler.
3)"interface"ler bir yapilacak isler listesidir.(to do list)
4)"multiple parent interface kullandiginizda ayni method ismi ile birden fazla method olusturursaniz
bu methodlarin return typelari ayni olmadlidir.Aksi takdirde hata verir.
5)Interface'lerde constructor olmadigi icin interface'lerden obje olusturulamaz.
6)"abstract class"larda class olduklari icin constructor vardir.Ama constructorlar abstract classlarda obje olusturamazlar.

Soru:  "Abstract Class ile Interface'in farklari nelerdir?"
        1)Method
           " Abstract Class" hem abstract hemde concrete methodlar icerebilir.
           "Interface"ler ise sadece abstract methodlar icerir.
           Ama istersek interface'ler icinde de default ve static keywordlar kullanarak concrete methodlar olusturabiliriz.
        2)Variable
          "Abstract Class"larda normal  Class'lardaki gibi her turlu variable olusturulabilir.
          "Interface"lerde ise variablelar public,static ve final olmak zorundadir.
        3)Inheritance
          "Abstract Class"lar class olduklari icin multiple inheritance musade etmezler.
          "Interface"ler ise multiple inheritance'i desteklerler.
        4)Object Creation
          "Abstract Class"larda constructor vardir ama object olusturmada kullanilmazlar.
          "Interface"lerde ise constructor olmadigindan object olusturulamaz.


          Soru: Object-Oriented Programming Language prensipleri nelerdir?
          i)Inheritance ii)Polymorphism iii)Encapsulation iv)Abstraction
 */

public class Civic implements Engine,Ac{

    @Override
    public void run() {

    }
}
