import java.util.Scanner;

public class Yahtzee {
   public  Cup myCup = new Cup();
   public  Player player;
   private  Scanner scanner = new Scanner(System.in);

   private  final int ROUND = 5;


 public Yahtzee(){
     System.out.println("What is your name?! ");
     String name = scanner.nextLine();
      player = new Player(scanner.nextLine().trim());


 }


 // making it  so the player gets 5 turns
    public void play() {

        for(int i = 0 ; i < ROUND ; i++){


            turn();}




    }

    public void getSelections() {


        System.out.println("Which dice  you  want to re roll? (1-5)");
        String input = scanner.nextLine();
        player.myCup.roll(player.myCup.parseInteger(input));

    }

    public void turn() {


            player.myCup.roll();


        for (int i = 0; i < 2; i++) {
            System.out.println(myCup.displayCup());
            getSelections();

        }

        System.out.println(myCup.displayCup());


        player.updateScore();
    }


}
