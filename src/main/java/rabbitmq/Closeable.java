package rabbitmq;

public class Closeable implements java.lang.AutoCloseable {
	
	public static void main(String[] args) throws Exception
	{
		try (Closeable closeable = new Closeable()) 
		{
			System.out.println("Inside try block...");
		}
		
		System.out.println("Outside try block");
	}

	@Override
	public void close() throws Exception 
	{
		System.out.println("AutoCloseable: close() called");
	}

}
