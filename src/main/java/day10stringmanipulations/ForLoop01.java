package day10stringmanipulations;



public class ForLoop01 {
    public static void main(String[] args) {

        //Tekrarlı işler için loop kullaniriz.
        //Dort cesit loop vardir.
        //i)for-loop ii)while loop iii)do while loop iv)for each loop

        // i)for-loop
        // Example 1 : Ekrana 5 kere "Hi!"yazdırınız.
             //Baslangic degeri  //Loop hangi sart altinda calisacak  //Increment(Artırma) veya Decrement(Azaltma)
        for ( int i = 1                  ; i<6                                   ;  i=i+1                                          ) {
            System.out.println("Hi");
        }

        //Example 2: 4den 7ye kadar tum sayilari ekrana yazdıran kodu yaziniz.

        for(int s =4 ; s<8 ; s++){
            System.out.print(s + " ");
        }
        System.out.println();

        //Example 3:14de 5e kadar tum sayilari ekrana yazdırınız
//
//        for (int s =14 ; s>4 ; s-- );{
//            System.out.print( s + " ");
//        }

        //Example 4:14den 5 e kadar tüm çift sayilari yazdiriniz.

        for(int i =14 ; i>4 ; i--){
            System.out.println(i + " ");
        }
        //2.Yol
        for (int i=14 ; i>4 ; i-- ){

            if(i%2==0){
                System.out.println(i + " ");
            }
        }

        //Example 5: 28 den 157ye kadar tum tek sayilari yazdirin.

      for(int i=28 ; i<158; i++){

          if(i%2!=0){
              System.out.println(i + " ");
          }
      }
        System.out.println();

      //Example 6 :"Java" Stringini "J*a*v*a" Stringine ceviren kodu yaziniz.

        String str = "Java";

        for (int i=0 ; i<str.length(); i++){

            System.out.print(str.charAt(i) + "*");
        }
        
        //Example 7 :Size verilen Stringde tekrarsız karakterleri yazdiriniz.
        // Hellooo Ali = HeAi
        String s= "Helloo Ali";
        for(int i =0; i<s.length() ; i++){
            
            char c = s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);
            }
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
















    }
}