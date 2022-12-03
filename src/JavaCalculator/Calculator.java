package JavaCalculator;

import java.util.Scanner;

public class Calculator {
    private int numOne;
    private int numWto;
    private int sum;
    private char sing;

    public void infoCalculator () {
        Scanner n1 = new Scanner(System.in);
            System.out.print("numOne>>> ");
                numOne = n1.nextInt();

        Scanner scannerSing = new Scanner(System.in);
            System.out.print("sing>>> ");
                sing = scannerSing.next().charAt(0);

        Scanner n2 = new Scanner(System.in);
            System.out.print("numWto>>> ");
                numWto = n2.nextInt();

       switch (sing) {
           case '+' : sum = numOne + numWto;
           break;
           case '-' : sum = numOne - numWto;
           break;
           case '*' : sum = numOne * numWto;
           break;
           case '/' : sum = numOne / numWto;
           default: System.out.println("error not is number");
           break;
       }
        System.out.println("Вы ввели " + numOne + " " + sing + " " + numWto + " = " + sum);
    }
}
