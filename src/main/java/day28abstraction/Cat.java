package day28abstraction;

public class Cat extends Mammal {

    /*
    Bir method parent classta "abstract" method ise;
    Child Class o methodu "override" edip kullanmak zorundadir.
    Bu yuzden herhangi bir fonksiyonu "Child Class" icin mecburi yapmak isterseniz o methodu
    abstract yapmalisiniz.
     */

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public void move() {
        System.out.println("Cat move");
    }
}
