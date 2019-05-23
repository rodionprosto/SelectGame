package R;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SelectGame {
    public static void main(String[] args) {
String input="";
        players.playeradd();
        input= new Scanner(System.in).nextLine();

        if (input.equals("1")){
RPS.addgame().startgame();

        }else if(input.equals("2")){
            Ugadai.addgame().startgame();

        }
    }
}
interface IGame{
    void startgame();
    void stopgame();
    void turngame();
}
class RPS implements IGame{

    @Override
    public void startgame() {
        System.out.println("RPS начались");
        turngame();
    }

    @Override
    public void stopgame() {
        System.out.println("RPS конец");
    }

    @Override
    public void turngame() {
        System.out.println("RPS ходим");
        String input=new Scanner(System.in).nextLine();
        if (input.equals("бумага")){
            if(new Random().nextInt(3)==0){
                System.out.println("камень");
                System.out.println("победа");
            }else if(new Random().nextInt(3)==1){
                System.out.println("ножницы");
                System.out.println("проигрыш");
            }else if(new Random().nextInt(3)==2){
                System.out.println("бумага");
                System.out.println("ничья");
            }
        }else if (input.equals("ножницы")){
            if(new Random().nextInt(3)==0){
                System.out.println("камень");
                System.out.println("проигрыш");
            }else if(new Random().nextInt(3)==1){
                System.out.println("ножницы");
                System.out.println("ничья");
            }else if(new Random().nextInt(3)==2){
                System.out.println("бумага");
                System.out.println("победа");
            }
        }if (input.equals("камень")){
            if(new Random().nextInt(3)==0){
                System.out.println("камень");
                System.out.println("ничья");
            }else if(new Random().nextInt(3)==1){
                System.out.println("ножницы");
                System.out.println("победа");
            }else if(new Random().nextInt(3)==2){
                System.out.println("бумага");
                System.out.println("проигрыш");
            }
        }

        stopgame();
    }
    static IGame addgame(){

        return new RPS();
    }
}
class Ugadai implements IGame{

    @Override
    public void startgame() {
        System.out.println("Ugadai начались");
    }

    @Override
    public void stopgame() {
        System.out.println("Ugadai конец");
    }

    @Override
    public void turngame() {
        System.out.println("Ugadai ходим");
    }
    static IGame addgame(){
        return new Ugadai();
    }
}
class players{
    static ArrayList<String>names=new ArrayList<String>();

    static void playeradd(){
   String input="";
        names.add("player");
        names.add("q");
        input=new Scanner(System.in).nextLine();
       if (names.contains(input)){
            System.out.println("имя занято");
            playeradd();
    }else {
           names.add(input);
           System.out.println("имя введено");
         }
    }
    //void player
}
