package NullPointerException;

public class NullPointer1 {
    public static void main(String[] args ) {
      // Example of Null Pointer Exception in Java
        // This program will throw Null Pointer Exception
        // because we are trying to access null variable.
        String s = "MicrotechNA";
        try {

            if("Skyit".equals(s)) {
                System.out.println("Both string are same");
            } else {
                System.out.println("Not same");
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null Pointer Exception");
        }
        finally {
            System.out.println("Finally block");
        }


    }
}
