class Computer{
    public void playMusic(){
        System.out.println("Playing Music...");
    }

    public String byPen(int num){
        if(num >= 10){
            return "Ben bought";
        }

        return "Nothing..";
    }
}

public class MethodsCls{
    public static void main(String args[]){
        Computer com = new Computer();
        com.playMusic();

        String buy = com.byPen(2);
        System.out.println(buy);
    }
}