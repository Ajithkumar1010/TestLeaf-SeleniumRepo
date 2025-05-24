package week4.day1;

public class MethodOverriding extends MethodOverloading {
	
	public void reportStep(String result, boolean isStatus) {
		System.out.println(result+" "+ isStatus);
	}
	public void takeSnap() {
	
		System.out.println("snap taken");
	}	

	public static void main(String[] args) {
		
		MethodOverriding obj=new MethodOverriding();
		obj.takeSnap();
		obj.reportStep("pass", true);
		

	}

}
