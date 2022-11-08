package day12loops;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //While loop icin loop bodysi icindeki kodun hic calistirilmama ihtimali vardir
        //zero execution mumkundur.
        int i = 1;

        while (i < 1) {
            System.out.println("While loop");
            i++;
        }

        //dowhile loopun bodysi icindeki kod her halükarda en az bir kere calisir.
        //zero eecution mumkun degildir.
        int k = 1;

        do {
            System.out.println("DoWhile loop");
            k++;
        } while (k < 1);


        //Example 1 : Bir ondalık sayinin ondalik kısmındaki rakamlarinin toplamini bulunuz.
        //            24.5673 == 5+6+7+3=21

        double num = 24.5673;
        System.out.println(num);
        // String.valueOf methodu parantezin icine konulan datanın tipini String yapar.
        String str = String.valueOf(num);
        System.out.println(str);
        //Regex icin nokta kullandiginizda "\\" koyunuz. Yani nokta "\\." seklinde olur.
        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);

        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);
        int sum =0;

        do {

            sum = sum+decimalInt%10;
            decimalInt = decimalInt/10;

        }while(decimalInt>0);
        System.out.println(sum);
    }}
