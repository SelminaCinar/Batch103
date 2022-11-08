package day11loops;

public class ForLoop02 {

    public static void main(String[] args) {

        //Example 1 : Bir Stringdeki "m" karakteri hariç tum karakterleri yazdiriniz.
        //Andromeda==>Androeda

        String str = "AndroMmeda";

        //1.Yol
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c != 'm' && c != 'M') {
                System.out.print(c);
            }
        }

        //2.Yol
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c == 'm') {
                continue; //Bosveeer! ==> Loopun icinde bazi degerler icin loopun calismamasini isterseniz continue kullanınız.
            }
            System.out.print(c);
        }
        System.out.println();
        //Example 2 : 1'den 100'e kadar 6 ile bolunenler haric tum tam sayilari ekrana yazdiriniz.

        for (int i = 1; i < 101; i++) {

            if (i % 6 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 3 : Size verilen bir Stringdeki m den önceki karakterleri yazdiriniz.

        String s = "Luxemburg";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == 'm') {
                break;
            }

            System.out.print(c);
        }
    }
}
