	import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;



public class House {
	
		protected int idNo;
		protected float price;
		protected String location;
		protected String advertiser;
		Photo image = new Photo(); 


	// default constructor	
		public House() {
		idNo = 0;
		price = 0;
		location = "";
		advertiser = "";
		}
	// primary constructor
	public House(int ID, float price, String location, String advertise) {

		idNo = ID;
		price = price;
		location = location;
		advertiser = advertise;
	}

	// copy constructor
	public House(House home) {

		SetIdNo(home.GetIdNo());
		SetPrice(home.GetPrice());
		SetLocation(home.GetLocation());
		SetAdvertiser(home.GetAdvertiser());
	}
	
	// Getters AND setters

		public int GetIdNo() {
			return idNo;
		}

		public float GetPrice() {
			return price;
		}

		public String GetLocation() {
			return location;
		}

		public String GetAdvertiser() {
			return advertiser;
		}

		// Setters

		public void SetIdNo(int ID) {
			idNo = ID;
		}

		public void SetPrice(Float price) {
			price = price;
		}

		public void SetLocation(String location) {
			location = location;
		}

		public void SetAdvertiser(String advertise) {
			advertiser = advertise;
		}

		
			public void AddHouse(House house) {
				
				Photo image = new Photo();
				int x=0;
				for(x=0;x<3;x++) {
				Scanner in = new Scanner(System.in);
			try {
				System.out.println("ID Number: ");
				house.SetIdNo(in.nextInt());

				System.out.println("Price: ");
				house.SetPrice(in.nextFloat());
				
				in.nextLine();
				System.out.println("Location: ");
				house.SetLocation(in.nextLine());
				
				
				System.out.println("Advertiser: ");
				house.SetAdvertiser(in.nextLine());
				

				System.out.println("Size of the photo (in kb): ");
				image.setSize(in.nextFloat());
				
				System.out.println("Dimensions of the photo: ");
				image.setDimensions(in.next());
				
			}catch (InputMismatchException e){
				System.out.println("Wrong Input");
				house.AddHouse(house);
			}
				
				try {
	
					FileWriter fileobject = new FileWriter("House.txt", true);
					
					fileobject.write(
							"\t" + house.GetIdNo() + "\t\t " + house.GetPrice() + "\t\t " + house.GetLocation()
									+ "\t\t " + house.GetAdvertiser()  + "\t\t " + image.getSize() + "\t\t " + image.getDimensions() +"\n");
					fileobject.close();
					System.out.println("\n\nInformation was added successfully...");
				
					
				} catch (IOException e) {
					System.err.println("\n\nFile culd not be added!");
				}
			}
		}
}
		
		


