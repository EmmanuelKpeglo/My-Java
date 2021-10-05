package playground;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<People> persons = new ArrayList<>();

        People p1 = new People("Zed", "Onini");
        People p2 = new People("Luigi", "Lee");
        People p3 = new People("Roshi", "Ro");
        People p4 = new People("Alphie", "Allen");
        People p5 = new People("Bucky", "Boco");

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);

        Iterator<People> iteratePersons = persons.iterator();

        while(iteratePersons.hasNext() ) {
            People p = iteratePersons.next();
            System.out.println(p.getFirstName()+" "+p.getLastName());
        }


/*
        for (People p : persons) {
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }
*/

    }
}
