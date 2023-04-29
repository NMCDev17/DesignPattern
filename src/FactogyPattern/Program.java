package FactogyPattern;

import FactogyPattern.Base.Animal;
import FactogyPattern.FactogyAnimal.BasicFactogyAnimal;
import FactogyPattern.FactogyAnimal.IFactogyAnimal;
import FactogyPattern.FactogyAnimal.RandomAnimal;

//Factogy method Pattern dung de tao 1 doi tuong ma ta chua ro the hien cua no la gi;
// the hien cua no se phai duoc tao dua tren 1 logic nao do;
//O day co 2 logic do la tao 1 doi tuong co the hien random hoac la theo thu tu lan luot;
public class Program {
    public static void main(String[] args) {
        IFactogyAnimal ianimal = null;
        int type = (int) (Math.random() * 2);
        if(type == 0)
        {
            ianimal = new BasicFactogyAnimal();
        }
        else if(type == 1)
        {
            ianimal = new RandomAnimal();
        }
        assert ianimal != null;
        ianimal.createAnimal().getName();
        ianimal.createAnimal().getName();
        ianimal.createAnimal().getName();
        ianimal.createAnimal().getName();
        ianimal.createAnimal().getName();
    }
}
