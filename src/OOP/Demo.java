package OOP;

public class Demo {
    public static void main(String[] args) {
        Student s = new Student();  //method ka naam camel case mein hota h but here s is capital that shows it is an special cae called "constructor"
        // constructor is of same name as class
        s.rollNo = 167;
        s.name="RIfa";
        s.collegeName= "LNCT";

        System.out.println(s);

        //s.init(rollNo=167, name="Rifa", collegeName="LNCT");
    }
}
