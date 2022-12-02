public class Player {
    public  String name;



    // since this already built out and created  we dont need to add it to the constructor
    public Cup myCup = new Cup();


    public int score = 0;


    public  Player(String name){
    this.name = name;
    }






    public int updateScore(){
        int total = 0;
      for( Die die : myCup.dice){
          total +=  die.faceUpValue;
      }

      score += total;

      return total;
    }


}
