public class ForLoop{
    public static void main(String args[]){
        // Normal For Loop
        /**for(int i = 0; i <= 5; i++){
            System.out.println("This is normal for loop: " + i);
        }**/

        // Day of the week and 6 hours time

        for(int num = 1; num <= 5; num++){
            System.out.println("Day " + num);
            for(int hour = 1; hour <= 9; hour++){
                System.out.println("   " + (hour + 8) + " - " + (hour + 9));
            }
        }
    }
}