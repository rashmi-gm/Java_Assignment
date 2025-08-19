package conditional_statement_question;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();
        //n! = n * (n - 1)!;
        //System.out.println("factorial of a number is: " + n!);
        long fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is:" + fact);
    }
}
