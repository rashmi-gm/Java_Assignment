package ExceptionHandeling_Assignment;

public class MultipleTryCatch {
    public static void main(String args[]){
        try{
            int num = 10/0;
            System.out.println(num);
        }
        catch(ArithmeticException e){
            System.out.println("number can't divide by zero " + e);
        }
        try{
            String s[] = null;
            System.out.println(s.length);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }try{
            int a[] = {1,2,3};
            System.out.println(a[4]);
        }
        catch(Exception e){
            System.out.println(e);
        }
        }
    }

