class vehicletostring
{
	String brand;
	int cc;
	int noOfWheel;
	double price;
 
 vehicletostring(String name, int cc, int noOfWheel, double price)
 {
	 this.brand=brand;
	 this.cc=cc;
	 this.noOfWheel=noOfWheel;
	 this.price=price;
 }
 public String toString()
 {
	 return  "brand:"+brand+" cc:"+cc+" noOfWheel:"+noOfWheel+" price:"+ price;
 }
 public static void main(String [] args)
 {
	 vehicletostring v1=new vehicletostring("MUSTANG",4500, 4, 3456000.0);
	 System.out.println(v1);
 }
}
 