class A{

    class B{
        private String name = "John";

        public void getName(){
            System.out.println(this.name);
        }
    }
}



public class InnerClass{
    public static void main(String a[]){

        A obj = new A();
        A.B obj1 = obj.new B();

        obj1.getName();
        
    }

}