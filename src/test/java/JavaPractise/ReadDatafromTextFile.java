package JavaPractise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDatafromTextFile {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("E:\\javaPractise\\test123.txt");
        BufferedReader br=new BufferedReader(fr);
        String textFromfile;
        while ((textFromfile=br.readLine())!=null){
          System.out.print(textFromfile);
        }

br.close();
    }
}
