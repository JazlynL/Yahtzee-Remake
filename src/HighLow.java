import java.util.Scanner;

public class HighLow {

    public static void play() {
        Scanner scanner = new Scanner(System.in);
        Die numeroUnoDie = new Die();
        Die numeroDosDDie = new Die();
        numeroUnoDie.roll();
        numeroDosDDie.roll();

        int totalAmount = numeroDosDDie.faceUpValue + numeroUnoDie.faceUpValue;
        System.out.println(numeroUnoDie.faceUpValue + "+" + numeroDosDDie.faceUpValue + "=" + (totalAmount));
        System.out.println("Will The next number be (h)igher or (l)ower?");
        String input = scanner.next();


        numeroUnoDie.roll();
        numeroDosDDie.roll();
//
        numeroUnoDie.roll();
        numeroDosDDie.roll();
//
        int newTotal = numeroUnoDie.faceUpValue + numeroDosDDie.faceUpValue;
//
        if (totalAmount == newTotal) {
//            System.out.println("Same Number ");
//
//        }
//
//       boolean isLarger = newTotal > totalAmount;
//        System.out.println(numeroUnoDie.faceUpValue + " +" + numeroDosDDie.faceUpValue + " = " + newTotal);
//        boolean  dieDie = false;
//        if(input == "h"){ // guessed higher
//            if(isLarger){
//                System.out.println("Number is higher you Win");
//            dieDie = true;
//            }
//
//
//
//        }else{    // if number is lower.
//            if(!isLarger){
//                dieDie = true;
//         }
//        }
//        System.out.println(dieDie ? "you Win!!" : "you Lose !!");

        }

    }
}
