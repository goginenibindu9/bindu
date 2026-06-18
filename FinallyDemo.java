class FinallyDemo {
    public static void main(String args[]) {

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught");
        } finally {
            System.out.println("Finally Block Executed");
        }

        System.out.println("Program Ends");
    }
}
