import com.parkinglot.Car;
import com.parkinglot.Motorcycle;
import com.parkinglot.ParkingLot;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ParkingLot P1 = new ParkingLot(2);

	       Car c1 = new Car("3542","Benz");
	       Car c2 = new Car("9587","Audi");
	       Motorcycle c3 = new Motorcycle("4556","Yamaha");
	       Motorcycle c4 = new Motorcycle("0897","Hero");
	       Motorcycle c5 = new Motorcycle("0897","Hero");
	       Motorcycle c6 = new Motorcycle("0897","Hero");
	      
	       P1.parkVehicle(c1);
	       P1.parkVehicle(c2);
	       P1.parkVehicle(c3);
	       P1.parkVehicle(c4);
	       P1.parkVehicle(c5);
	       P1.parkVehicle(c6);
	     
	       P1.ComapnyParked("Audi");
	       P1.ComapnyParked("Benz");
	       P1.leave(c2,0);
	       P1.leave(c3,1);
	      
	      

	}

}
