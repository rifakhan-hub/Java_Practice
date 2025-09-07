package String;

public class Freq81 {
    public static void main(String[] args) {
        String s = "jsadlhguargjdnvif";
        for (char ch ='a'; ch<= 'z'; ch++){
            int count =0;
            for(int i =0 ; i < s.length(); i++){
                if( s.charAt(i)== ch ) count ++;
            }
            System.out.println();
        }
    }
}
