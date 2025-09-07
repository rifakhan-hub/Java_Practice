package String;

public class Prefix77 {

    // how things work behind the seeen
    public static boolean startsWith(String o, String pref) {
         for(int i=0; i<pref.length(); i++){

         }
         return false;
    }

    public static void main(String[] args) {
        String words[] = {"attention", "practice", "argue", "attention"};
        String pref = "at";
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].startsWith(pref))
                ans++;

        }
        System.out.println(ans);
    }
}

