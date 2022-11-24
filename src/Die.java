public class Die {
// two terms I learned is the difference between override , and over load
    /*  overload : this occurs when two or more methods in the same class have the same name but different
    parameter
    *    override: This  is when the method signature is the same in the superclass
    * as the child class.*/
    public int numberOfSides;
    public int faceUpValue;

    public Die(){
        numberOfSides = 6;
    }
    public Die(int numberOfSides){
        this.numberOfSides = numberOfSides;
    }

    public void roll(){
        faceUpValue = (int) ((Math.random() + numberOfSides) + 1) ;

    }
}
