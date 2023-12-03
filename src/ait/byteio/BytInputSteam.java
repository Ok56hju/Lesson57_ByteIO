package ait.byteio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BytInputSteam {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("date")){
//            System.out.println("Available = " + fin.available());
//            int  a = fin.read();
//            System.out.println(a);
//            a = fin.read();
//            System.out.println(a);
//            a = fin.read();
//            System.out.println(a);
//            a = fin.read();
//            System.out.println(a);

//            Op1
//            int a = fin.read();
//            while ( a != -1){
//                System.out.println(a);
//                a = fin.read();
//            }
//            Op2
//             int len = fin.available();
//            for (int i = 0; i < len; i++) {
//                int a = fin.read();
//                System.out.println(a);
//            }

//            op 3
//            int len = fin.available();
//            byte[] arr = new byte[];

        }catch (FileNotFoundException e){
            e.printStackTrace();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
