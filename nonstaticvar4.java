class nonstaticvar4
{
	
	void start()
	{
		System.out.println("Start");
	}
	byte no;
	short no2;
	int no3;
	long no4;
	float no5;
	double no6;
	char gender;
	boolean b;
	String name;
	
	 
	
	public static void main(String [] args)
	{
		System.out.println("Vijay Karande");
		
		nonstaticvar2 v1=new nonstaticvar2();
		
		v1.no=100;
		v1.no2=40;
		v1.no3=200;
		v1.no4=300;
		v1.no5=0;
		v1.no6=60.00;
		v1.gender='m';
	
		v1.name="Vijay";
		System.out.println(v1.no);
			System.out.println(v1.no2);
				System.out.println(v1.no3);
					System.out.println(v1.no4);
						System.out.println(v1.no5);
							System.out.println(v1.no6);
								System.out.println(v1.gender);
									System.out.println(v1.b);
										System.out.println(v1.name);
									nonstaticvar4.start();
										
	}
}
