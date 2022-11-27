import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // die scanner method
//       Scanner scanner = new Scanner(System.in);
//       Die numeroUnoDie = new Die();
//       Die numeroDosDDie = new Die();
//       numeroUnoDie.roll();
//       numeroDosDDie.roll();
//
//       int totalAmount = numeroDosDDie.faceUpValue + numeroUnoDie.faceUpValue;
//        System.out.println(numeroUnoDie.faceUpValue +"+"+numeroDosDDie.faceUpValue+ "=" + (totalAmount));
//        System.out.println("Will The next number be (h)igher or (l)ower?");
//        String input = scanner.next();
//
//
//        numeroUnoDie.roll();
//        numeroDosDDie.roll();
//
//        numeroUnoDie.roll();
//        numeroDosDDie.roll();
//
//        int newTotal = numeroUnoDie.faceUpValue + numeroDosDDie.faceUpValue;
//
//        if(totalAmount == newTotal) {
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
//
//
//
//


        // cup version scanner method.


        Cup myCup = new Cup();
        Scanner scanner = new Scanner(System.in);
        String input;

        myCup.roll();
        System.out.println(myCup.displayCup());
        System.out.println("Which dice  you  want to re roll? (1-5)");
        input = scanner.nextLine();


        myCup.roll(myCup.parseInteger(input));
       System.out.println(myCup.displayCup());

  }

}