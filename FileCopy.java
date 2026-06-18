import java.io.*;

class FileCopy {
    public static void main(String args[]) throws Exception {

        FileInputStream fin = new FileInputStream("ArrayException.java");
        FileOutputStream fout = new FileOutputStream("destination.txt");

        int ch;

        while ((ch = fin.read()) != -1) {
            fout.write(ch);
            System.out.print((char) ch);
        }

        fin.close();
        fout.close();

        System.out.println("\nFile Copied Successfully");
    }
}
