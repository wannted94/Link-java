package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileRead {
    public static void main(String[] args) {
        try {
            BufferedReader file = new BufferedReader(new FileReader("src/files/FileRead.java"));
            String line;

            while (true) {
                try {
                    while ((line = file.readLine()) != null){

                        System.out.println(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
