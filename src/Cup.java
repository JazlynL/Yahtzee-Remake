import java.util.ArrayList;
import java.util.List;

public class Cup {

    List<Die> dice = new ArrayList<>();


    public Cup(){
        while(dice.size() < 5){
            Die newDice = new Die();
            newDice.roll();
            System.out.println(newDice);
            dice.add(new Die());
        }

    }

    public void roll(){
        for(Die die : dice){
            die.roll();
        }




    }




    // overloading example... same method name but different parameters
    public void roll( int selection){
        dice.get(selection).roll();
    }


    public void roll(List<Integer> selections){
        for(int selection : selections){
            roll(selection);
        }
    }

    public String displayCup(){
        String output = "";
        for(Die die : dice){
            System.out.println(die.faceUpValue);
            output += die.faceUpValue + " ";
        }


        return output.trim();

    }

    public List<Integer> parseInteger(String input){
        String [] inputarr =   input.split(" ");


        List<Integer> arrList = new ArrayList<>();
        for(String number: inputarr){
            arrList.add(Integer.parseInt(number)-1);
        }
  return  arrList;
    }
}
