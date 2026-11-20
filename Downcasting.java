class A{
    public void show(){
        System.out.println("Show A");
    }
}

class B extends A{
    public void view(){
        System.out.println("View B");
    }
}


public class Downcasting{
    public static void main(String a[]){
        // Up Casting
        //A obj = (A) new B();
        //obj.show();

        // Down Casting
        A obj = new B();
        B obj1 = (B) obj;
        obj1.view();
    }
}