package conditional_statement_question;

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int evensum = 0;
        int oddsum = 0;

        System.out.println("enter how many numbers you want numbers: ");
        int count = s.nextInt();
        System.out.println("enter the " + count + " numbers: ");
        for(int i = 1; i <= count; i++) {
            int num = s.nextInt();
            if(num % 2 == 0)
        {
            evensum += num;
        }
        else{
            oddsum += num;
        }
        }
        System.out.println("sum of even number is : " + evensum);
        System.out.println("sum of odd number is :" + oddsum);


    }
}
