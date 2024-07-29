class book
{
	String name;
	int noOfPage;
	double price;
	
		book(String name, int noOfPage, float price)
		{
			this.name=name;
			this.noOfPage=noOfPage;
			this.price=price;
		}
		@Override
		public String toString()
		{
			return "name:"+name+"noOfPage:"+noOfPage+"price:"+price;
		}
		public static void main(String [] args)
		{
			book b1=new book("Java",1200,2346);
			System.out.println(b1);
			
		}
}

		