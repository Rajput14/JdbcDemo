interface Truck{
	int AXEL=5;
	int WEIGHT=10;
}
interface Tollbooth{
	public void calculateTollDue(Truck t);
	public void displayData();
}
class FordTruck implements Truck{
	int a,w;
	String s;
	FordTruck(int a,int w){
		this.a=a;
		this.w=w;
		s="FordTruck";
	}
}
class NissanTruck implements Truck{
	int a,w;
	String s;
	NissanTruck(int a,int w){
		this.a=a;
		this.w=w;
		s="NissanTruck";
	}
}
class DaewooTruck implements Truck{
	int a,w;
	String s;
	DaewooTruck(int a,int w){
		this.a=a;
		this.w=w;
		s="DaewooTruck";
	}
}
class AlleghenyTollBooth implements Tollbooth{
	int due,alx,wig,total=0;
	String tru;
	static int count;
	public void calculateTollDue(Truck t) {}
	public void calculateTollDue(FordTruck f) {
		due=f.a*FordTruck.AXEL+(f.w/450)*FordTruck.WEIGHT;
		this.alx=f.a;
		this.wig=f.w;
		this.tru=f.s;
		count++;
	}
	public void calculateTollDue(NissanTruck f) {
		due=f.a*NissanTruck.AXEL+(f.w/450)*NissanTruck.WEIGHT;
		this.alx=f.a;
		this.wig=f.w;
		this.tru=f.s;
		count++;
	}
	public void calculateTollDue(DaewooTruck f) {
		due=f.a*DaewooTruck.AXEL+(f.w/450)*DaewooTruck.WEIGHT;
		this.alx=f.a;
		this.wig=f.w;
		this.tru=f.s;
		count++;
	}
	public void displayData() {
		System.out.println("Type of Vehicle is :- "+tru+" , No of Axles is :- "+alx+" , Weight of Truck is :- "+wig+"\n");
		System.out.println("Toll-Charge due :- $"+due);
		total+=due;
	}
	void tillLastReceipt() {
		System.out.println("No of Vehicles crossed TollBooth :- "+count);
		System.out.println("Total amount Collected by TollBooth is :- $"+total);
	}
	void reSetData() {
		System.out.println("******************************\n\t\tReSet-Counter\n");
		total=0;count=0;
		this.tillLastReceipt();
	}
}


public class TestTollBooth {



	public static void main(String[] args) {
		AlleghenyTollBooth booth=new AlleghenyTollBooth();

		FordTruck ford=new FordTruck(5,12000);
		booth.calculateTollDue(ford);
		booth.displayData();
		System.out.println("********************************************************");
		NissanTruck nissan=new NissanTruck(2,5000);
		booth.calculateTollDue(nissan);
		booth.displayData();
		System.out.println("********************************************************");
		DaewooTruck daewoo=new DaewooTruck(6,17000);
		booth.calculateTollDue(daewoo);
		booth.displayData();
		System.out.println("*********************************************************");
		FordTruck ford1=new FordTruck(4,12500);
		booth.calculateTollDue(ford1);
		booth.displayData(); 
		System.out.println("******************************************\n\t\tTill-Last-Receipt\n");
		booth.tillLastReceipt();
		booth.reSetData();
		System.out.println("*****************************************************");
		NissanTruck nissan1=new NissanTruck(5,5600);
		booth.calculateTollDue(nissan1);
		booth.displayData();
		System.out.println("*******************************************************\n\t\tTill-Last-Receipt\n");
		booth.tillLastReceipt();
	}



}
