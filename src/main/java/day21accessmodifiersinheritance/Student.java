package day21accessmodifiersinheritance;

public class Student {

    /*
    Access Modifier
    1)public    2)protected   3)default(Access Modifier'i default yapmak icin yazmamalısınız.)   4)private

      Note : Access Modifier'lari genisten dara dogru sayiniz.
      public > protected > default > private

      Note : Access Modifier'lari birer birer aciklayiniz.
      Note : Protected ile default'un farkini soyleyiniz.
      Note : Class'lar icin hangi access modifier'lar kullanılabilir.
             public - default kullanilir.(protected ve private kullanilamaz.)

     */
    //public her classtan kullanilabilir.
    public String stdName = "TomHanks";

    //protected olanlar baska package'lerden kullanilmaz ancak baska package'de child class icinden kullanilabilir.
    protected String adress = "Miami";

    //default olanlar baska package'den kullanılamazlar.
    String email = "th@gmail.com";

    //private olanlar sadece olusturulduklari Class icinde kullanilabilirler.
    private String stId = "20206517004";

}
