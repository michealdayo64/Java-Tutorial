import packagesex.tools.*;


class Humans{
    int age = 12;

    int getAge(){
        return age;
    }
}

public class NormalString{
    public static void main(String a[]){
        // By Default Strings are Immutable

        Humans obj = new Humans();
        int ans = obj.getAge();
        System.out.println(ans);

        // String as a Class
        //String name = new String("David");
        //System.out.println(name);

        // String as a Variable
        //String name = "Shola";
        //System.out.println(name);

        //Example obj = new Example();
        //obj.show();

    }
}