package JavaPractise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDatatoTextFile {

    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("E:\\javaPractise\\test123.txt");
        BufferedWriter br=new BufferedWriter(fw);
        br.write("a=1");
        br.write("b=2");
        br.write("c=3");
        System.out.print("writing finished");
        br.close();

    }
}
