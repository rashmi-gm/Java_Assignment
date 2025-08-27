package ExceptionHandeling_Assignment;

public class Try_Catch {
    public static void main(String[] args){
        int j = 10;
        try{
            int a = j / 0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println("number can't divide by zero: " + e);
        }
    }
}
