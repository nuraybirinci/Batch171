package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {
        //Swap: yer degistirmek 1. kap patates 2. kap domates ==> swap => 1. kap domates 2. kap patates

        int a = 12;
        int b = 5; // Swap ten sonra ==>a=5, b=12
        int temp = 0;

        //1. adim:
        temp = a;
        //2. adim:
        a = b;
        // 3. adim:
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2. yol
        int elma = 12;
        int armut = 5;

        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);

        elma = elma + armut;
        armut = elma - armut;
        elma = elma - armut;

        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);


    }
}
