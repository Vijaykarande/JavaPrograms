class tkp
{
	String bigp="3000Cr";
	String car="RR";
}
class tinku extends tkp
{
	String sp="34cr";
	
}
class inheritancep2
{
	public static void main(String [] args)
	{
		tinku t1=new tinku();
		System.out.println(t1.bigp);
		System.out.println(t1.car);
		System.out.println(t1.sp);
	}
}
