package homeassignments.week2.day4;

public class JavaConnection extends MySqlConnection {
	
	public void executeQuery()
	{
		System.out.println("Execute the query");
	}
	
	
	public void reconnect()
	{
		System.out.println("Reconnected");
	}

	public static void main(String[] args) {

		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
		jc.reconnect();
		
		
	}

}
