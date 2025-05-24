package week4.day1;

public class MethodOverloading {
	
	public void reportStep(String result, boolean isStatus) {
		System.out.println(result+" "+ isStatus);
	}
	
	public void reportStep(String result, boolean isStatus, int percent) {
		System.out.println(result+" "+ isStatus+" "+percent);
	}

	public static void main(String[] args) {
		
		MethodOverloading ob= new MethodOverloading();
		ob.reportStep("pass", true);
		ob.reportStep("fail", false, 40);

	}

}
