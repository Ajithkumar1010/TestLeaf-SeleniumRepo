package week4.day1;

//Home Assignment ->Method overloading

public class APIClient {
	
	public void sendRequest (String endpoint) {
		
		System.out.println("Sending request to endpoint: " + endpoint);
        
        System.out.println("Request sent.");
	}
	
    public void sendRequest (String endpoint, String requestBody, boolean requestStatus) {
		
    	 System.out.println("Sending request to endpoint: " + endpoint);
         System.out.println("Request body: " + requestBody);
         
         if (requestStatus) {
             System.out.println("Request sent successfully.");
         } else {
             System.out.println("Request failed.");
         }
     }

	public static void main(String[] args) {
		
		APIClient ob=new APIClient();
		ob.sendRequest("https://api.example.com/getData");
		System.out.println("..............................................................");
		ob.sendRequest("https://api.example.com/getData", "{ \"name\": \"John\" }", true);
		
	}

}
