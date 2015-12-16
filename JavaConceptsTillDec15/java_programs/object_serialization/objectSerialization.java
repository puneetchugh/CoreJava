import java.io.*;

public class objectSerialization
{
	public static void main(String [] args)
	{
		try
		{
			employee e = new employee();
			e.emp_name = "Puneet Chugh";
			e.emp_id = "xtr687";
			e.emp_salary = 1000;
			e.emp_phone = "2019937915";

			FileOutputStream fileOut = new FileOutputStream("output.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
		
		}
		catch(IOException i)
		{
			i.printStackTrace();
			return;
		}
		
	}
}
