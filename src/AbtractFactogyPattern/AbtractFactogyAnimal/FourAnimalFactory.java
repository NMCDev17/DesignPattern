package AbtractFactogyPattern.AbtractFactogyAnimal;

import AbtractFactogyPattern.Base.Cat;
import AbtractFactogyPattern.Base.Dog;
import AbtractFactogyPattern.Base.Animal;
import AbtractFactogyPattern.Base.Pig;

public class FourAnimalFactory implements AbtractFactoryAnimal{
    public Animal createAnimal()
    {
        int random = (int)(Math.random()*3);
        if(random == 0)
        {
            return new Dog();
        }
        else if(random == 1)
        {
            return new Cat();
        }
        else if(random == 2){
            return new Pig();
        }
        return null;
    }
}
