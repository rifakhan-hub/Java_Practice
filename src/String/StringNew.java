package String;

public class StringNew {
    public static String capitalize(String s) {
        if (s.length() <= 2)
            return s.toUpperCase();

        char[] arr = s.toCharArray();
        int n = arr.length;
        arr[0] = Character.toUpperCase(arr[0]);
        arr[n - 1] = Character.toUpperCase(arr[n - 1]);

        return new String(arr);
    }

    public static void main(String[] args) {
        String sentence = " Aur bhai kya haal chal";
        String[] words = sentence.split( " ");
      //  for (int i = 0 ; i <)

    }
}





