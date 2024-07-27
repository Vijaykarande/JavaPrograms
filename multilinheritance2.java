class Grandfather
{
	String bigp="300CR";
	String car="REnfield";
	int land=30;
}
class Father extends Grandfather
{
	String mdp="100CR";
	
}
class Son extends Father
{
	String smp="2CR";
}
class multilinheritance2
{
	public static void main(String [] args)
	{
		Son s1=new Son();
		System.out.println(s1.bigp);
		System.out.println(s1.car);
		System.out.println(s1.mdp);
		System.out.println(s1.land);
		System.out.println(s1.smp);
		
	}
}

	