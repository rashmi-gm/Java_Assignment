public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block starts...");

            // Outer risky operation
            int num = 10 / 2; // change denominator to 0 to test ArithmeticException
            System.out.println("Division result: " + num);

            try {
                System.out.println("Inner try block starts...");

                // Inner risky operation
                int arr[] = {1, 2, 3};
                System.out.println("Accessing element at index 5: " + arr[5]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index out of bounds -> " + e);
            }

            System.out.println("Inner try block finished.");

        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Arithmetic exception -> " + e);
        }

        System.out.println("Program continues after nested try blocks...");
    }
}
