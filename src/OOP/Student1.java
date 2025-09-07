package OOP;

public class Student1 {
    //constructor method

    int rollNo;
    String name;
    String collegeName;

    // default construct present in every java class and is not visible but works
    public Student1() {
        System.out.println("yeh vala bhi chl raha h ");
    }

    public Student1(int rollNo, String name, String collegeName ) {
        this.rollNo=rollNo;
        this.name=name;
        this.collegeName=collegeName;

    }

 //   @Override
   // public String toString() {...}
}
