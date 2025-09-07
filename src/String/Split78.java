package String;

public class Split78 {
    public static String capitalize(String s){
        if(s.length()== 1)
            return s.toUpperCase();
        char first = s.charAt(0);
        String second = s.substring(1);
        if(first >= 'a' && first<= 'z'){
            first = (char) (first-32);
        }
        return first + second ;

    }
    public static void main(String[] args) {
        String sentence = " aur bhai kya haal chal";
        String[] words = sentence.split(" ");
        String ans = "";
        for (String word : words ){
            ans = ans + capitalize(word);
            System.out.println(capitalize(word));
        }


    }
}
