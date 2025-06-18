import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(1, "First", 0);
        Person person2 = new Person(2,"Second",20);
        Person person3 = new Person(3,"Third",30);
        Person person4 = new Person(4,"Fourth",40);
        Person person5 = new Person(5,"Fifth",50);

        HashMap<Integer, Person> personMap = new HashMap<>();

        personMap.put(1,person1);
        personMap.put(2,person2);
        personMap.put(3,person3);
        personMap.put(4,person4);
        personMap.put(5,person5);

        ArrayList<Person> list1 = new ArrayList<>();

        list1.add(person1);
        list1.add(person2);
        list1.add(person3);
        list1.add(person4);
        list1.add(person5);

        ArrayList<Person> list2 = new ArrayList<>();

        Person person6= new Person(1, "First", -10);
        Person person7 = new Person(2,"Second",20);
        Person person8 = new Person(3,"Third",30);
        Person person9 = new Person(4,"Fourth",40);
        Person person10 = new Person(5,"Fifth",50);

        list2.add(person6);
        list2.add(person7);
        list2.add(person8);
        list2.add(person9);
        list2.add(person10);

        System.out.println(list1.getFirst() == list2.getFirst());

        System.out.println(list1.getFirst().equals(list2.getFirst()));

    }
}