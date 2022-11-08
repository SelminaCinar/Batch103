package day25exception;

public class E03Expection {

    public static void main(String[] args) {
        String str = "Ali";

        getNumOfChars(str);//3

        String s ="";
        getNumOfChars(s);

        String t = null;
        getNumOfChars(t);
        //NullPointerException
        //Eger length() methodunda null kullanirsaniz bu exceptionı alirsiniz.

    }

    //Bir Stringde bulunan karakterlerin sayisini bulabilmek icin bir method olusturunuz.

    public static void getNumOfChars(String str) {

        try{
            System.out.println(str.length());

        }catch (NullPointerException e){
            System.err.println("length() methodunda bir problem olustu");
            e.printStackTrace();
            //bu methodu kullandiginiz zaman System.out.println kullanmaniza gerek yoktur.


        }


    }
}
