
public class Machine implements Iinfo {

	private int id = 7;
	
	public Machine(int id) {
		this.id = id;
	}

	public void start() {
		System.out.println("Machine Started");
	}

	@Override
	public void showInfo() {
		System.out.println("Machine id is " + id);
		
	}
}
