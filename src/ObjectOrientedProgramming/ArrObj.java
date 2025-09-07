package ObjectOrientedProgramming;

import java.util.Scanner;

public class ArrObj {
    int age ;
    String name;

    ArrObj(int age, String name){   // assigning the data and initializing using constructor
        this.age = age;
        this.name = name;

    }

    @Override
    public String toString() {     // creating the toString using generate
        return "ArrObj{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        ArrObj arr[] = new ArrObj[size];   // array for storing object
        for (int i = 0; i<arr.length; i++ ){
            sc.nextLine();                // for working code
            System.out.println("Enter the name of student");
            String name = sc.nextLine();  // add buffer reader or do something kyunki upar nextInt use hua h and nextLine se pehle koi input nhi le satke agr liya to it will not work
            System.out.println("Enter the age of student ");
            int age = sc.nextInt();

            ArrObj obj = new ArrObj(age, name);   // constructor called automatically with declaring object
            arr[i] = obj;


        }
    }
}
