public class StringMutable{
    // Mutable string that can change
    public static void main(String a[]){
        StringBuffer name = new StringBuffer("Mark");
        name.append(" David");

        String b = name.toString();
        System.out.println(b);
        System.out.println(name);
    }

}