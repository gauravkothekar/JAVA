class Car{
	int topSpeed=0;
	String Brand;
	String Color;
	int noOfSeats;
	int noOfWheels;
	boolean hasSunRoof;

	Car(int topSpeed,String Brand,String Color,int noOfSeats,int noOfWheels, boolean hasSunRoof){
		this.topSpeed = topSpeed;
		this.Brand = Brand;
		this.Color =Color;
		this.noOfSeats =noOfSeats;
		this.noOfWheels = noOfWheels;
		this.hasSunRoof = hasSunRoof;
		this.PrintDetails();		
	}

	Car(int topSpeed,String Brand,int noOfSeats,int noOfWheels, boolean hasSunRoof){
		this.topSpeed = topSpeed;
		this.Brand = Brand;
		this.noOfSeats =noOfSeats;
		this.noOfWheels = noOfWheels;
		this.hasSunRoof = hasSunRoof;
		this.PrintDetails();		
	}
	
	int PrintDetails(){
		System.out.println(this.topSpeed);
		System.out.println(this.Brand);
		System.out.println(this.Color);
		System.out.println(this.noOfSeats);
		System.out.println(this.noOfWheels);
		System.out.println(this.hasSunRoof);
return null;
	}

	public static void main(String [] args){
		
	
		Car Ford = new Car(200,"Ford","Red",4,4,false);
		//Ford.Color = "Red";

		
		Car MG = new Car(150,"MG","White",4,4,true);
		//MG.Color = "White";

		Car Audi = new Car(150,"Audi",4,4,true);
		
		//System.out.println(Ford);
		//	
		//System.out.println(Ford.Color);
		//System.out.println(MG.Color);

System.out.println(Ford.PrintDetails());

	}
}




