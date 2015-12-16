import java.io.*;

public class employee implements java.io.Serializable
{
	public String emp_name;
	public String emp_id;
	public transient int emp_salary;
	public String emp_phone;
}

