package B7_abtract.AnimalInterfaceEdible;
import B7_abtract.AnimalInterfaceEdible.Animal.Animal;
import B7_abtract.AnimalInterfaceEdible.Animal.Tiger;
import B7_abtract.AnimalInterfaceEdible.Animal.Chicken;
import B7_abtract.AnimalInterfaceEdible.Edible.Edible;
import B7_abtract.AnimalInterfaceEdible.Fruits.*;
public class AnimalAndInterfaceEdible {
    public static void main(String[] args) {
        Animal[] o1 = new Animal[2];
        o1[0] = new Tiger();
        o1[1] = new Chicken();
        for (Animal animal : o1) {
            System.out.println(animal.Makesound());
            if (animal instanceof Chicken) {
                Edible o2 = (Chicken) animal;
                System.out.println(o2.howToEat());
            }
        }
        Fruit[] o2 = new Fruit[2];
        o2[0] = new Apple();
        o2[1] = new Orange();
        for (Fruit fruit : o2){
            System.out.println(fruit.howToEat());
        }
    }

}
