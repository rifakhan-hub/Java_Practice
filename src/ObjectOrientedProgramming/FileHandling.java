package ObjectOrientedProgramming;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {

      //  String data
        File fl = new File("//C://Users//RIFA//OneDrive//文档//Desktop//Jjjj");
        System.out.println(fl.createNewFile()); //to create a file if not exist true and will create it, if already exist give false
        System.out.println(fl.mkdir()); // mkdir= make directory to create folder
        System.out.println(fl.exists());
     //   fl.delete();
     //   System.out.println(fl.exists());
        System.out.println(fl.isFile());
        System.out.println(fl.isDirectory());
        System.out.println(fl.getName());
        System.out.println(fl.getAbsolutePath());

        // write
        FileWriter fw = new FileWriter(fl);
       // fw.write(data);

    }
}
