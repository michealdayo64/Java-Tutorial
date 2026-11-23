public class ExceptionClass{
	public static void main(String a[]){
	int i = 18;
	int j = 0;

	try{
	j = 18/0;
}catch(Exception e){
	System.out.println("Something went wrong");
}

	System.out.println(i);
}
}