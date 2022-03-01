package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public Main() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("output.txt");

        fileWriter.write("  A a\n  B b\n  C c\n  D d\n  E e\n  F f\n  G g\n  H h\n  I i\n J j\n K k\n" +
                " L l\n M m\n N n\n O o\n P p\n Q q\n R r\n S s\n T t\n U u\n V v\n W w\n X x\n Y y\n Z z\n" +
                        "  0\n  1\n  2\n  3\n  4\n  5\n  6\n  7\n  8\n  9");
        fileWriter.close();


        try (FileReader read = new FileReader("output.txt")){
            Scanner sc = new Scanner(read);
            while (sc.hasNextLine()){
                for (int i = 1; i <= 36; i++) {
                System.out.println(i +":"+ sc.nextLine());}
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

}







