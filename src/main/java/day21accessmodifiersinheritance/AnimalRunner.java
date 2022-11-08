package day21accessmodifiersinheritance;

public class AnimalRunner {
    /*
    1)Inheritance sayesinde
      i)Code tekrarlarindan kurtuluruz.
      ii)Code tamiri(maintenance) kolay olur.
      iii)Child classlari daha atomik yapmış oluruz.

    2)Bir classi baska bir classin Child Classi yapmak icin
      "extends" keyword kullanilir. Ilk yazilan class Child, ikinci yazilan class Parent olur.
    3)Child Class objectleri Parent Class'dan method ve variable'lari kullanabilirler.
    4)Parent class objectleri Child classdan method ve variablari kullanamazlar.
    5)Object Class her classin parent'idir.
      Javada Object class haric her classin parenti vardir.
      Javada parenti olmaya tek class object classdir.
    6)Private method ve variablelar Child classlar tarafindan kullanilamazlar.
      Protected method ve variablelar Child Classlar tarafindan kullanilabilir.
      Default method ve variablelar ayni package'deki Child Classlar tarafindan kullanilabilir.
      public  method ve variablelar Child Classlar tarafindan kullanilabilir.

      Note : Child classlar tarafindan kullanılabilir olmak "Inherit" edilebilir demektir.

      7) 4 tip inheritance vardir.
         i)Multilevel Inheritance : Java bunu kullanir ,apartman yapisi
         ii)Hierarchical Inheritance : Bir parent icin coklu child,Java bunu kabul eder.
         iii)Multiple Inheritance : Bir childe coklu Parent , Java bunu desteklemez.
             (Java does not support Multiple Inheritance )
         iv) Single Inheritance : Bir child class icin bir Parent class demektir ,java bunu destekler.

     */

    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();


        /////////////////////

        Dog d1 = new Dog();

        d1.bark();
        d1.eat();
        d1.drink();


        /////////////////////

        Bird b1 = new Bird();

        b1.tweet();
        b1.eat();
        b1.drink();

        /////////////////////////


    }
}
