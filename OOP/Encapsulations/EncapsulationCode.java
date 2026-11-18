class Humans{
	// Make Sure you variable defined in a class is private

	private int age;
	private String name;

	public void setName(String name){
	this.name = name;
}

	public String getName(){
	//this.name = "Shola";
	return this.name;
}

	public void setAge(int age){
	this.age = age;
}

	public int getAge(){
	//this.age = 24;
	return this.age;
}

}

public class EncapsulationCode{
	public static void main(String a[]){
	Humans hm = new Humans();
	hm.setName("David");
	hm.setAge(25);
	System.out.println(hm.getName() + " : " + hm.getAge());
}
}

