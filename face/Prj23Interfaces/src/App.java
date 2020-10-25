import java.util.ArrayList;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine mach1 = new Machine(8);
		mach1.start();
		mach1.showInfo();
		
		Person person1 = new Person("Bob");
		person1.greet();
		person1.showInfo();
		
		ArrayList<Iinfo> list = new ArrayList<Iinfo>();
		
		list.add(mach1);
		list.add(person1);
		
		
		for (Iinfo iinfo : list) {
			System.out.println("************");
			iinfo.showInfo();
			System.out.println("************");
			System.out.println("************");
			System.out.println("******testtt******");
		}
		
		
		

	}

}
