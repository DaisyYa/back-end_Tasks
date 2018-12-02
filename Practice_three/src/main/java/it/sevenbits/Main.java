package it.sevenbits;

import java.io.*;

/**
 * class main
 */
public class Main {
    /**
     * main method
     * @param arg String[]
     */
    public static void main(final String[] arg) {
        File file = new File("MyHomework.txt");
        File file1 = new File("Homework3.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("failed to create file");
        }
        byte[] array = new byte[(int) file1.length()];
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file1))) {
            bufferedInputStream.read(array);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("IO error");
        }
        String surname = "Yakubova";
        byte[] surnameToByte = surname.getBytes();
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file))) {
            bufferedOutputStream.write(array, 0, array.length);
            bufferedOutputStream.write(surnameToByte, 0, surnameToByte.length);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("IO error");
        }
    }
}
