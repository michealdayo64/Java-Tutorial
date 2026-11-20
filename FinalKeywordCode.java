// Final Keyword for Class
class Cars{
    public void drive(){
    System.out.println("Drive");
    }
}

class SportsCars extends Cars{
    public void drive(){
    System.out.println("Drive for cars");
    }
}


public class FinalKeywordCode{
    public static void main(String a[]){
        // Final Keyword
        // Final Keyword is used to declare constants

    // Final keyword variable
    /** final int num = 12;
    num = num + 13;
    System.out.println(num);**/

    SportsCars obj = new SportsCars();
    obj.drive();
        
    }
}