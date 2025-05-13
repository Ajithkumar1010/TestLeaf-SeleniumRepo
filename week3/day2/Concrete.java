package week3.day2;

public class Concrete implements DatabseConnection {
	
	public void data() {
		System.out.println("data added to the db");
	}
	public void connect() {
		System.out.println("connected to the database");
	}

	
	public void disconnect() {
		System.out.println("disconnected to the database");
	}

	
	public void executeUpdate() {
		System.out.println("updated to the database");
	}

	public static void main(String[] args) {
		
		Concrete obj = new Concrete();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
		obj.data();
		

	}

	

}
