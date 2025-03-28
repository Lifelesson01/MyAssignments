package homeassignments.week2.day4;

public class APIClient {
	
	
	public void sendRequest(String endpoint)
	{
		System.out.println("Endpoint URL is verified:"+endpoint);
	}
	
	
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
	{
		System.out.println("RequestBodyURL is verified:"+endpoint+" "+requestBody+" "+requestStatus);
	}

	public static void main(String[] args) {
		APIClient aclient=new APIClient();
		aclient.sendRequest("https://www.facebook.com");
		aclient.sendRequest("https://www.google.com", "Page is successfully loaded", false);
		
	}

}
