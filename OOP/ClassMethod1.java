class Calc{
    int a;

    public int add(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
}


public class ClassMethod1{
    public static void main(String args[]){

        int a1 = 20;
        int a2 = 30;

        Calc cal = new Calc();

        //int result = cal.add(a1, a2);
        System.out.println("Final Result is: " + cal.add(61, 12));
        System.out.println("Final Result is: " + cal.add(23, 18));
        System.out.println("Final Result is: " + cal.add(98, 26));

    }
}