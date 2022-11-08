package day22inheritancepolymorphism;

public class Runner {
    public static void main(String[] args) {

        //Inheritance'da variable'lar secilirken Java object'in data type'ine bakar.
        //Oncelikle istediginiz variable'i Objectin data type'i olan Class'da arar.
        //O Classda bulamazsa Parent Classlara bakar.
        //Hicbir Parent Classda bulamazsa hata verir.
        Cat c1 = new Cat();
        System.out.println(c1.a);//14
        System.out.println(c1.b);//34
        System.out.println(c1.c);//45

        Mammal c2 = new Cat();
        System.out.println(c2.a);//13

        Animal c3 = new Cat();
        System.out.println(c3.a);//12

        //Object olustururken objectin data type'i Child Classlardan secilemez.

        //Inheritance'da variable'lar secilirken java Constructor'a bakar.
        //Oncelikle istediginiz methodu Constructori kullanilan Classtan alır.
        //O class'ta bulamazsa Parent classlara bakar,hicbir yerde bulamazsa hata verir.
        Cat c4 = new Cat();
        c4.eat();
        c4.drink();

        Mammal c5 = new Cat();
        c5.eat();

        Animal c6 = new Animal();
        c6.eat();




    }
}
