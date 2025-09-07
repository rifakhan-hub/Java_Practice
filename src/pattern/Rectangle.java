package pattern;

public class Rectangle {
    public static void main(String[] args) {

        for (int j=0; j<5; j++) { //outer looop is for rows
            for (int i = 1 ; i<=5; i++ ){  // inner loop is for column
                System.out.print("*  ");
            }
            System.out.println(" ");
        }
    }
}
