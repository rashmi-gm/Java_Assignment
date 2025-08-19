import java.util.Scanner;

public class VariablesDataType {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = 3;
        System.out.println("Enter the first number: ");
        double a = s.nextDouble();
        System.out.println("enter the second number: ");
        double b = s.nextDouble();
        System.out.println("Enter the third number: ");
        double c = s.nextDouble();
        double sum = a + b + c;
        double average = sum / n;
        System.out.println("Average of this 3 numbers: " + average);

    }
}
