package ExceptionHandeling_Assignment;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println(a);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("this block will exceute if there is exception is there are not");
        }
    }

    }

