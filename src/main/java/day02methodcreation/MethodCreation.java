package day02methodcreation;

public class MethodCreation {

    //main method icinde kullanacaginiz hersey "static" olmalidir.
    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2, 5));

       System.out.println(ucSayiyiCarp(2,1.5,6));

       System.out.println(ilkIkiyiToplaUcuncuIleCarp(6,7.3,21));

       //sout yazıp enter'a basarsaniz system.out.println gelir.
        //Ekrana bir sey yazdirmak icin iki kod var -System.out.println -System.out.print


    }

    //Example 1: Toplama islemi yapan bir method olusturunuz
    public static double toplamaYap(double a, double b){
        return a+b;
    }

    //Example 2: Uc sayiyi birbiri ile carpan bir method olusturunuz
    public static double ucSayiyiCarp(double a, double b, double c){
        return a*b*c;
    }

    //Example 3: Uc sayidan ilk ikisini toplayip ucuncu ile carpan method olusturup sonucu ekrana veriniz.
    public static double ilkIkiyiToplaUcuncuIleCarp (double a,double b,double c){
        return (a+b)*c;
    }

}









