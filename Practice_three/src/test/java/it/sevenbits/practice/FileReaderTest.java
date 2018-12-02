package it.sevenbits.practice;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FileReaderTest {

    @Test
    public void readLineTest() {
        FileReader fileReader = new FileReader(new File("src/test/resources/file.txt"));
        Assert.assertEquals("file.txt line 1: 1",fileReader.readLine());
        Assert.assertEquals("file.txt line 2: 22",fileReader.readLine());
        try {
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void readLineMockTest() {
        FileReader mockFileReader = mock(FileReader.class);
        Example example = new Example();
        when(mockFileReader.hasMoreLines()).thenReturn(true, true, true, true, false);
        when(mockFileReader.readLine()).thenReturn("file.txt line 1: 1","file.txt line 2: 22", "file.txt line 3: 333", "file.txt line 4: 4444");
        Assert.assertEquals(21, example.getLongestLineCharsCount(mockFileReader));
    }
    @Test
    public void readLineMock2Test() {
        FileReader mockFileReader = mock(FileReader.class);
        Example example = new Example();
        when(mockFileReader.hasMoreLines()).thenReturn(false);
        when(mockFileReader.readLine()).thenReturn("");
        Assert.assertEquals(0, example.getLongestLineCharsCount(mockFileReader));
    }

}