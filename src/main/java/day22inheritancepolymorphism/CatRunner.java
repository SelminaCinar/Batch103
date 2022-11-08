package day22inheritancepolymorphism;

public class CatRunner {

    public static void main(String[] args) {

        /*
          1)Javada Object olustururken  Constructor'lar Parentten Child'a dogru calistirilir.
          2)Java en ust parent constructor'a cikabilmek icin "super()" kodunu kullanir.
          3)"super()"kodu her constructor'in ilk satirinda gizli olarak bulunur.
          4)"super()" kodunu isterseniz gorunur sekilde de yazabilirsiniz.
          5)"super()" kodunu gorunur sekilde yazarsaniz sakin ha ilk satir disina koymayiniz,hata verir.
          6)"super()" kodu Parent Classdan constructor cagirmaya yarar.
         */

        Cat c1 = new Cat();

    }
}
