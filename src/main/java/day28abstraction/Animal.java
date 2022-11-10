package day28abstraction;

public abstract class Animal {


    public void drink(){
        System.out.println("Animal drink");
    }

    //bodysi olmayan methodlar "abstract method" olarak adlandirilir.
    //Bir methodu abstract yapmak icin i) Method body'i sil ii) Abstract keyword kullan.
    //"abstract" methodlar "abstract class" icinde olmalidir.
    //"abstract class"larda hem "abstract method" hemde "concrete"(non-abstract) method kullanilabilir.
    public abstract void eat();

    //abstract "move" method olusturunuz.

    public abstract void move();
}

