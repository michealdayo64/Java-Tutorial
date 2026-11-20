abstract class A{
    public abstract void show();
}

class B extends A{
    public void show(){
        System.out.println("Show B");
    }
}


public class AbstractKeyword{
    public static void main(String a[]){
        A obj = new B();
        obj.show();
    }

}