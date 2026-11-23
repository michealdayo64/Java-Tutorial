// Without Contructor
/**enum Status{
	Pending, Success, Error, Going
}**/

// With Contructor
enum Laptop{
	Pending(price: 3000), Success(price: 2000), Error(price: 400), Going(price: 5000);

	private int price;
	private Laptop(int price){
	this.price = price;
}

	public int getPrice(){
	return this.price;
}
}

public class EnumClass{
	public static void main(String a[]){
	
	Laptop lap = Laptop.Pending;
	System.out.println(lap);

//Status aa = Status.Going;
// Switch Case
	/** Switch(aa){
	Case Pending:
	    System.out.println("Pending");
	    break;
	Case Success:
	    System.out.println("Success");
	    break;
	Case Status.Error:
	    System.out.println("Error");
	    break;
	default:
	    System.out.println("Error");
            break; 
}**/

	// If esle For Enum
	/** if(aa == Status.Pending){
		System.out.println("Pending");
}
	else if(aa == Status.Success){
		System.out.println("Success");
}
	else if(aa == Status.Error){
		System.out.println("Error");
}
	else{
		System.out.println("Going"); 
} **/
}

}