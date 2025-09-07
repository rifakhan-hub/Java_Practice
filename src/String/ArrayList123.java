package String;

import java.util.ArrayList;

public class ArrayList123 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(19);
        list.add(15);
        list.add(20);
        list.add(12);
        System.out.println(list);

        list.add(2,43);
        System.out.println(list);

        list.set(2,100); // replace the value of that index
        //list.clear();

       // list.remove(Integer.valueOf(19));   //used to remove the value from the list
        System.out.println(list);

        System.out.println(list.contains(13));
        System.out.println(list.get(100));
        System.out.println(list.size());
        System.out.println(list.indexOf(400));
        list.forEach((n)-> System.out.println(n*10));

        System.out.println(list);
        System.out.println(list.subList(2,4));


    }
}
