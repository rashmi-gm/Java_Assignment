package conditional_statement_question;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = s.nextInt();
        if(num >= 0){
            System.out.println( "number " + num + " is positive");
        }
       else{
            System.out.println( "number " + num + " is negative");
        }
    }
}
