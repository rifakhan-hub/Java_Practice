package pattern;

public class RightTriangle46 {
    public static void main(String[] args) {

        for (int i=1; i<=5; i++) {
            for (int j=1; j<=i; j++ ){      // j is less than equal to i kyunki jitni row utni baar loop chalega
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
