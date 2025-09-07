import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of folder");
        String project = sc.nextLine();
        String path = "C://Users//RIFA\\OneDrive\\文档\\Desktop\\pro";

        File folder = new File(path+ project);
        folder.mkdir();

        File flHTML = new File(path + project + "//index.html");
        flHTML.createNewFile();

        FileWriter fwHTML = new FileWriter(flHTML);
        fwHTML.write("<!DOCTYPE html>\\n\" +\n" +
                "                \"<html lang=\\\"en\\\">\\n\" +\n" +
                "                \"<head>\\n\" +\n" +
                "                \"    <meta charset=\\\"UTF-8\\\">\\n\" +\n" +
                "                \"    <meta name=\\\"viewport\\\" content=\\\"width=device-width, initial-scale=1.0\\\">\\n\" +\n" +
                "                \"    <link rel=\\\"stylesheet\\\" href=\\\"style.css\\\">\\n\" +\n" +
                "                \"    <title>Document</title>\\n\" +\n" +
                "                \"</head>\\n\" +\n" +
                "                \"<body>\\n\" +\n" +
                "                \"      <h1>hello world</h1>\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"      <script src=\\\"script.js\\\"></script>\\n\" +\n" +
                "                \"</body>\\n\" +\n" +
                "                \"</html>");
        fwHTML.close();

        File flCSS = new File(path + project + "Style.css");
        flCSS.createNewFile();

        FileWriter fwCSS = new FileWriter(flCSS);
        fwCSS.write("*{\\n\" +\n" +
                "                \"    padding: 0;\\n\" +\n" +
                "                \"    margin: 0;\\n\" +\n" +
                "                \"    box-sizing: border-box;\\n\" +\n" +
                "                \"}\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"html,body{\\n\" +\n" +
                "                \"    height: 100%;\\n\" +\n" +
                "                \"    width: 100%;\\n\" +\n" +
                "                \"}\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"h1{\\n\" +\n" +
                "                \"    color: rebeccapurple;\\n\" +\n" +
                "                \"}");
        fwCSS.close();

        File flJS = new File(path+project+"//script.js");
        flJS.createNewFile();



    }
}
