import java.util.Scanner;

public class Yahtzee {
   public  Cup myCup = new Cup();
   public  Player player;
   private  Scanner scanner = new Scanner(System.in);

   private int totalScore = 0;

   private int finalScore = 0;

   private  final int ROUND = 5;


 public Yahtzee(){


     System.out.println("What is your name?! ");
      player = new Player(scanner.nextLine().trim());



 }


 // making it  so the player gets 5 turns
    public void play() {

      for(int round = 1 ; round<= ROUND ; round++){


          int score = turn(round);
          finalScore += score;
      }

      //
        System.out.println("Final score: "+ finalScore);



    }

    public void getSelections() {


        System.out.println("Which dice  you  want to re roll? (1-5)");

        String input = scanner.nextLine();

        player.myCup.roll(player.myCup.parseInteger(input));




    }

    public int turn(int round ) {


        player.myCup.roll();

        for (int i = 0; i < 2; i++) {


            System.out.println(player.myCup.displayCup());
            getSelections();


        }


        int score = player.updateScore();
        System.out.println(player.myCup.displayCup());

        totalScore += score;
        System.out.println(
                "Your whole score " + totalScore);
        return totalScore;
    }


}
