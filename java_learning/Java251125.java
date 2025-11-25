package java_learning; 

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class Java251125 {
    public static void main(String[] args) throws IOException {
        // Fixed-size input and output
        // InputStream in = System.in;
        // InputStreamReader reader = new InputStreamReader(in);
        // char[] a = new char[3];
        // reader.read(a);

        // System.out.println(a);

        // BufferedReader,it can accept all input regardless of its length
        // InputStream in = System.in;
        // InputStreamReader reader = new InputStreamReader(in);
        // BufferedReader br = new BufferedReader(reader);

        // String a = br.readLine();
        // System.out.println(a);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
        System.out.println(sc.next());
        sc.close();
    }
}