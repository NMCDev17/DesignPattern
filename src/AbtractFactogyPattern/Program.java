package AbtractFactogyPattern;
import AbtractFactogyPattern.AbtractFactogyAnimal.AbtractFactoryAnimal;
import AbtractFactogyPattern.AbtractFactogyAnimal.FourAnimalFactory;
import AbtractFactogyPattern.AbtractFactogyAnimal.TwoLegAnimalFactory;

//abstract factory pattern dung de tao cac doi tuong thuoc nhieu ho khac nhau nhung vẫn cùng 1 gốc chung;
//abstract factory pattern bao gom nhieu factory method;
//abstract factory pattern thuc chat cung giong nhu factory pattern nhung scope lon hon;

public class Program {
    public static void main(String[] args) {
        AbtractFactoryAnimal factoryAnimal = null;
        int random = (int) (Math.random() * 2);
        if(random == 0){
            factoryAnimal = new TwoLegAnimalFactory();
        }
        else{
            factoryAnimal = new FourAnimalFactory();
        }

        factoryAnimal.createAnimal().getName();
        factoryAnimal.createAnimal().getName();
        factoryAnimal.createAnimal().getName();
        factoryAnimal.createAnimal().getName();
        factoryAnimal.createAnimal().getName();
    }
}
