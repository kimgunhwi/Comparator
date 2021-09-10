import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		List<Fruit> fl = new ArrayList<Fruit>();
		
		//append fruit
		Fruit s1 = new Fruit(101, "Apple", 1000);
		fl.add(s1);
		Fruit s2 = new Fruit(102, "Orange", 1500);
		fl.add(s2);
		fl.add(new Fruit(103, "Kiwi", 2000));
		fl.add(new Fruit(104, "Banana", 2700));
		fl.add(new Fruit(105, "Strawberry", 3100));
		fl.add(new Fruit(106, "Mango", 3900));
		fl.add(new Fruit(107, "Pear", 2000));
		fl.add(new Fruit(108, "Grape", 2500));
		fl.add(new Fruit(109, "Peach", 2000));
		fl.add(new Fruit(110, "Lemon", 1800));
		fl.add(new Fruit(111, "Watermelon", 8000));
		fl.add(new Fruit(112, "Melon", 5000));
		fl.add(new Fruit(113, "Cherry", 3500));
		
		
		Collections.sort(fl, new FruitComparator());
		System.out.println("Fruit List (ordered by name)");
		for(Fruit s : fl) {System.out.println(s.toString());}
		System.out.println();
		
		Collections.sort(fl, new FruitComparatorDesc());
		System.out.println("Fruit List (reverse ordered by name)");
		for(int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
		

	}

}
