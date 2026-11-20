interface A{
    void show();
}

interface B{
    void config();
}

class C implements A, B{
    public void show(){
        System.out.println("Show");
    }

    public void config(){
        System.out.println("Config");
    }
}



public class MultipleInterface{
    public static void main(String a[]){

        A obj = new C();
        obj.show();

        B obj1 = new C();
        obj1.config();

    }

}