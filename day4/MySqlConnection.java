package homeassignments.week2.day4;

public abstract class MySqlConnection implements DatabaseConnection{
	

	
	
	public  void connect()
	{
		System.out.println("Connected");
	}
	
	public void disconnect()
	{
		System.out.println("DisConnected");
	}
    public void executeUpdate()
    {
    	System.out.println("ExecuteUpdate");
    }
    
     public abstract void executeQuery();

}
