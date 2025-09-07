package String;

public class Freq81UsingBitMap {
    public static void main(String[] args) {
        String s = "hdkfjguseejbf";
        int[] bitMap = new int[26];
        for (int i =0; i<s.length(); i++)
            bitMap[s.charAt(i)-97]++;

        for(int i =0 ; i < bitMap.length; i++){
            if(bitMap[i]> 0 ) System.out.println((char)(i+97) + " -> " + bitMap[i]);
        }


    }
}
