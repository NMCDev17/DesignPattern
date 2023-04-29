package FactogyPattern.FactogyAnimal;

import FactogyPattern.Base.Animal;
import FactogyPattern.Base.Cat;
import FactogyPattern.Base.Dog;
import FactogyPattern.Base.Duck;

public class RandomAnimal implements IFactogyAnimal{
    @Override
    public Animal createAnimal() {
        int random = (int) (Math.random() * 2);
        if(random == 0){
            return new Dog();
        }
        else if(random == 1){
            return new Cat();
        }
        else{
            return new Duck();
        }
    }
}
