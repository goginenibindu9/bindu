class ArrayException {
    public static void main(String args[]) {

        try {
            int a[] = {10,20,30,40,50};

            System.out.println(a[10]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e);
        }

        System.out.println("Program Continues...");
    }
}
