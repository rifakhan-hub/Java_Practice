package ObjectOrientedProgramming;

public class employee {

    int age;
    String name;
    int salary;

    public static void main(String[] args) {
        employee obj1 = new employee();
        System.out.println(obj1.age);
        obj1.age = 69;
        obj1.name = "kamlesh";
        obj1.salary = 10000;
        System.out.println(obj1.toString());
        obj1.age = 49;
        obj1.name = "suresh";
        obj1.salary = 100000;
        System.out.println(obj1.toString());

    }
}
