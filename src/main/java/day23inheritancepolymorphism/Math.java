package day23inheritancepolymorphism;

public class Math extends Courses{

    public void practice(){
        System.out.println("Solve questions");
    }

    public Math(){

        super("x");
        System.out.println("Constructor 1");
    }

    //Aynı Class'ın icinde diger Constructor'ı kullanmak icin this(); kullan.

    public Math(int a){
        this();
        System.out.println("Constructor 2");
    }

    }

