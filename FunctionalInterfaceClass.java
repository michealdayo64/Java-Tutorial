@FunctionalInterface
interface A{
	//void show();
	int show(int a, int b);
}

/** class B implements A{
	public void show(){
		System.out.println("Show B");
}
} **/

public class FunctionalInterfaceClass{
	public static void main(String a[]){
	
	// Lambda Expression
	/** A obj = () ->{
	System.out.println("Show B");
};
	obj.show(); **/


// Anornymous Function
	 A obj = new A(){
	public int show(int a, int b){
		//System.out.println("Show B");
	return a + b;
}
};
	int result = obj.show(1, 2); 
	System.out.print(result);

	// Normal Fuction
	/** A obj = new B();
	obj.show(); **/
}
}