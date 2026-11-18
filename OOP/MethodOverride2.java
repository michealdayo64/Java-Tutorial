class A{
	public A(){
	System.out.println("Class A");
}

	public void helloA(){
	System.out.println("Hello A");
}
}

class B extends A{
	public B(){
	System.out.println("Class B");
}
	public void helloA(){
	System.out.println("Hello B");
}
}

public class MethodOverride2{
	public static void main(String a[]){
	B rn = new B();
	rn.helloA();
}
}