package day23inheritancepolymorphism;

public class Cat extends Mammal{

    public void meow(){
        System.out.println("Cats meow");
    }

    @Override // Override annotation'ını kullanarak,Javanın yaptigimiz Override islemini kontrol etmesini sağlarız.
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }

    //Asagıdaki method "Overriding Methodu"
    @Override
    public Animal create() {
        return new Mammal();
    }

    /*
    1)Override yaparken "methodun body"si degistirilir.
    2)Override yaparken ASLA method signature'a(isim ve parametre)degistirilemez.
    3)Override yaparken "inheritance"olmak zorundadır.
    4)Override yaparken "access modifier"lar belli kurallara gore farklılaştırılabilirler.
      i)"private"methodlar override edilemezler.
      ii)Child classtaki override edien methodun access modifieri Parent classdaki
      methodun access modifieri ile ayni veya daha geniş olmalidir.
      Note:Child Classdaki methodun access modifieri daha dar olamaz.
      iii)default methodlar ayni package icindeyse override edilebilir,
      farklı packageden override edilemezler.
    5)Parent Classtaki methodun return type'i void ise return type degistirilemez.
    6)Parent Classtaki methodun return type'i primitive ise return type degistirilemez.
    7)Parent Classtaki methodun return type'i Wrapper Class ise return type degistirilemez.
    8)Parent Classtaki methodun return type'i Parent Class ise return type childlardan biri olabilir.
      Note : Child Classdaki return typw Parent Classdakinden genis olamaz.
      Note: Aralarında Parent-Child iliskisi olmayan classlar overriding de return type degisiminde kullanilamazlar.
       MESELA "Short" ,"Integer'dan kucuktur fakat arlarında Parent Child iliskisi olmadigindan "Integer"yerine "Short"kullanamazsiniz.

      Note: Child daki methodun Return Typeindan PArenttaki methodun Return Typeina gidişte "IS-A"Relationship olmali.
            Parenttan Childa HAS-A.
      Note : Aralarında IS-A Relationship olan Data Typelara Covariant denir
      9)Final methodlar Override edilemezler.Çünkü overridingde method body degistirilir fakat final method
        body degistirilmesine musade etmez.
      10)Polymorphism = Overloading + Overiding
      Note: Polymorphism nedir derlerse Overloading ve Overridingi anlatin
      11)Overloading ile Overriding arasındaki fark nedir ?
      i)Overloading icin "inheritance" gerekmez fakat Overiding icin gerekir.
      ii)Private methodlar Overload edilebilir,Override edilemezler.
      iii)"final" methodlar Overload edilebilir,Override edilemezler.
      iv)"Overloading" static polymorphism olarak,Overriding dynamic polymorphism olarak adlandırılır.
      Cunku "static" methodlar Overload edilebilir,Override edilemezler.
      v)Overloadingde method siganture degisir ama Overriding method signature dokunulmaz.
     */
}
