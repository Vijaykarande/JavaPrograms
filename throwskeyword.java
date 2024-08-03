import java.io.FileInputStream;
import java.io.FileNotFoundException;
class throwskeyword
{
	public static void OpenFile() throws FileNotFoundException
	{
		FileInputStream f1=new FileInputStream("d//vi");
	}
	public static void main(String [] args) throws FileNotFoundException
	{
		OpenFile();
	}
}
