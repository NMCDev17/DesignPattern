package AbtractFactogyPattern.AbtractFactogyAnimal;

import AbtractFactogyPattern.Base.Chicken;
import AbtractFactogyPattern.Base.Duck;
import AbtractFactogyPattern.Base.Animal;

public class TwoLegAnimalFactory implements AbtractFactoryAnimal {
    @Override
    public Animal createAnimal() {
        int random = (int) (Math.random() * 2);
        if(random == 0){
            return new Chicken();
        }
        else if(random == 1){
            return new Duck();
        }
        return null;
    }

}
