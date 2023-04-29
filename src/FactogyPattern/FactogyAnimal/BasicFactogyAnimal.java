package FactogyPattern.FactogyAnimal;

import FactogyPattern.Base.Animal;
import FactogyPattern.Base.Cat;
import FactogyPattern.Base.Dog;
import FactogyPattern.Base.Duck;

public class BasicFactogyAnimal implements IFactogyAnimal{
    private int index;
    @Override
    public Animal createAnimal() {
        if(index == 0){
            index++;
            return new Dog();
        }
        else if(index == 1){
            index++;
            return new Cat();
        }
        else{
            index = 0;
            return new Duck();
        }

    }
}
