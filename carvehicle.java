interface vehicle
{
	void start();
	void stop();
}
interface car extends vehicle
{
	void honk();
}
class nano implements car
{
	@Override
	public void start()
	{
		System.out.println("Nano Start");
	}
	@Override
	public void honk()
	{
		System.out.println("POW POW");
	}
	
	public void shifGear()
		{
			System.out.println("Gear Shifted");
		}
	@Override
	public void stop()
	{
		System.out.println("Nano Stopped");
	}
}
class carvehicle
{
	public static void main(String [] args)
	{
		nano n1=new nano();
		n1.start();
		n1.honk();
		n1.shifGear();
		n1.stop();
	}
}

	
	