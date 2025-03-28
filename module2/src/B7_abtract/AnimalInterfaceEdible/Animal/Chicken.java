package B7_abtract.AnimalInterfaceEdible.Animal;

import B7_abtract.AnimalInterfaceEdible.Edible.Edible;

public class Chicken  extends Animal implements Edible {
    @Override
    public String Makesound(){
        return "chicken: cluck cluck";
    }

    @Override
    public String howToEat(){
        return "chicken: Could be Fried";
    }
}
