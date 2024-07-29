class eqmethod
{
	String bName;
	int noOfPages;
	
	
	
	eqmethod(String bName, int noOfPages )
	{
		this.bName=bName;
		this.noOfPages=noOfPages;
		
		
	}
	@Override
	
	public boolean equals(Object o)
	{
		eqmethod temp= (eqmethod) o;
		
		if(this.bName == temp.bName && this.noOfPages == temp.noOfPages)  
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String [] args)
	{
		eqmethod e1 = new eqmethod("Java",230);
		
		eqmethod e2 = new eqmethod("Java",230);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
	}
	
	
}


