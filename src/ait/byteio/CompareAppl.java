package ait.byteio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CompareAppl {
    public static long main(String[] args) throws FileNotFoundException {
        try (FileInputStream fin1 = new FileInputStream(args[0]);
             FileInputStream fin2 = new FileInputStream(args[1])) {

            int count = 0;
            long pos = 1;
            while ((count = fin1.read()) != -1) {
                if (count != fin1.read()) {
                    return pos;
                }
                pos++;
            }
            if (fin1.read() == -1) {
                return -1;
            } else {
                return pos;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
