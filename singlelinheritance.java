class parent
{
	String surname="Karande";
	String bigp="666Cr";
	String car="Thar";
}
class child extends parent
{
	String smp="34Cr";
}
class singlelinheritance
{
	public static void main(String [] args)
	{
		child s1=new child();
		System.out.println(s1.surname);
		System.out.println(s1.bigp);
		System.out.println(s1.car);
		System.out.println(s1.smp);
	}
}