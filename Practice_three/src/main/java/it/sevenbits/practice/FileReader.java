package it.sevenbits.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * class FileReader with methods readLine and hasMoreLines
 * reads one by one and converts it
 */
public class FileReader implements AutoCloseable {
    private File file;
    private int i = 0;
    private String nextLine = null;
    private BufferedReader bufferedReader = null;

    /**
     * create FileReader
     * @param file file
     */
    public FileReader(final File file) {
        this.file = file;
        try {
            bufferedReader = new BufferedReader(new java.io.FileReader(file));
            tryRead();
        } catch (FileNotFoundException e) {
            System.out.println("Error! File not found");
        }
    }

    private File getFile() {
        return file;
    }

    private String getNextLine() {
        return nextLine;
    }

    private void setNextLine(final String nextLine) {
        this.nextLine = nextLine;
    }

    private void tryRead() {
        try {
            setNextLine(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * reads a string and adds file name and line number data to it
     * @return converted string
     */
    public String readLine() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getFile().getName()).append(" line ").append(++i).append(": ").append(getNextLine());
        tryRead();
        return stringBuilder.toString();
    }

    /**
     * checks if the next line is read
     * @return true if can read the next line
     */
    public boolean hasMoreLines() {
        if (getNextLine() == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void close() throws Exception {
        bufferedReader.close();
    }
}
