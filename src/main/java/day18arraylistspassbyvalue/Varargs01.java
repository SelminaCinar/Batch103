package day18arraylistspassbyvalue;

public class Varargs01 {
    /*
    1)Farkli sayilardaki parametrelerle calisabilen bir method olusturmak isterseniz
    "Varargs" kullanmalisiniz.
    2)"Varargs" arka tarafta array kullanir , bu yuzden "varargs" larla calisirken "Array" lerle calisiyormus gibi davranabilirsiniz.
    3)"Varargs" olusturmak icin "<data type>...<varargs ismi>"
    4)Bir methodda varargsin yaninda baska bir parametre kullanilabilir mi?
      Varargs en sonda olmak sarti ile kullanilir.
    5)Bir methodda birden fazla varargs kullanilabilir mi ?
      Varargs en sonda olmak zorunda oldugundan , birden fazla kullanirsaniz en az biri
      en sonda olmayacaktir.Buda 4.kural ile celisir.

     */
    public static void main(String[] args) {

        int r1 =add(2,3);
        System.out.println(r1);//5

        int r2 =add(2,3,4);
        System.out.println(r2);//9

        int r3 =add(2,3,4,5,6,7,8,9);
        System.out.println(r3);//44

    }
//    //İki sayinin toplamini return eden methodu olusturunuz.
//
//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    //Uc sayinin toplamini return eden methodu olusturunuz.
//    public static double topla(double a, double b, double c) {
//        return a + b + c;
//    }
//
//    //Dort sayinin toplamini return eden methodu olusturunuz.
//    public static int sum(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }

    //Istedigimiz kadar sayiyi toplayabilecegimiz method olusturalim.
    public static int add( int... a) {//Varargs bu kalıptır.

        int sum = 0;

        for (int w : a) {
            sum = sum + w;
        }
        return sum;


    }
}
