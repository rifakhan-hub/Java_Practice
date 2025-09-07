package Loop;

public class AutomorphicNum39 {
    public static void main(String[] args) {
        int n =25;
        int temp =n;
        int cod = 0;

        while   (n !=0){
            cod++;
            n /= 10;
        }
        n = temp;
       int sq = n*n;
        // last digit from spuare
        int lastDigits = sq % (int)(Math.pow(10,cod));
        System.out.println(lastDigits == n? "Auto" : "Not Auto");


    }
}
