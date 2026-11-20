interface A{
    void show();
    void config();
}

class B implements A{
    public void show(){
        System.out.println("Show");
    }

    public void config(){
        System.out.println("Config");
    }
}


public class InterfaceCode{
    public static void main(String a[]){

        A obj = new B();
        obj.show();
        obj.config();
    }
}