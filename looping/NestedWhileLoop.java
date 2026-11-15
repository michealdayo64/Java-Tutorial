public class NestedWhileLoop{
	public static void main(String args[]){
	
int i = 0;

while(i < 5){
	System.out.println("value of I is: " + i);

	int j = 1;
	while(j <= 3){
		System.out.println("Value of J is:" + j);
		j++;
}
	i++;
}

}
}