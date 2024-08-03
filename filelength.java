import java.io.FileInputStream;
import java.io.FileNotFoundException;
class filelength
{
	public static void FileLength(String s)
	{
		System.out.println(s.length());
		
	}
	public static void main(String [] args)
	{
		try
		{
			FileLength(null);
		}
		catch(NullPointerException e)
		{
			System.out.println("NPEH");
			e.getMessage();
		}
	}
}

	