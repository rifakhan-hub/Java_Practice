package ObjectOrientedProgramming;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreation {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        File fl = new File("//");
        fl.createNewFile();


        // write
        FileWriter fw = new FileWriter(fl);
        fw.write(data);
        fw.close(); //

        //read
        FileReader fr = new FileReader(fl);
        int i;
        while((i = fr.read())!= -1){
            System.out.println((char)i);
        }

    }
}
