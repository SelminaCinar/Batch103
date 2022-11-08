package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        //Arrayslerin icine primitive data tipleri ve referencelar yerlestirilebilir.

        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprise you";

        System.out.println(Arrays.toString(str));


        //String bir array olusturunuz ve "Tom"ve "Tom"dan onceki tum elemanları yazdiriniz.

        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojin"};

        for (String w : arr) {

            System.out.print(w + " ");

            if (w.equals("Tom")) {
                break;
            }
        }

        System.out.println();


        //String bir array olusturunuz ve "Tom"ve "Jane"haric tum elemanları yazdiriniz.

        String arr1[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojin"};

        for (String w : arr1) {


            if (w.equals("Tom") || w.equals("Jane")) {
                continue;
            }
            System.out.print(w + " ");
        }

        System.out.println();


        //Kullanıcı ile beraber bir Array olusturunuz.
        //Bir ögretmenin sınıfındaki ogrencilerin isimlerini applicationa yuklemesini saglayan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");
        int numOfStd = input.nextInt();
        String names[] = new String[numOfStd];

        System.out.println("Girisi sonlandirmak icin Q harfine basiniz");

        for (int i = 1; i <= numOfStd; i++) {

            System.out.println("Lutfen " + i + ". ogrencinin ilk ismini giriniz");


            String stdName = input.next();
            if (stdName.equalsIgnoreCase("Q")) {
                break;
            }

            names[i - 1] = stdName;

        }
        System.out.println(Arrays.toString(names));


    }
}
