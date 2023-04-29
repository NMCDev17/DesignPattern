package DecoratorPattern;
//Decorator Design Pattern co the dung de them hang vi / trang thai cho 1 doi tuong tai thoi diem runtime
// bang cach lay cac hanh vi / trang thai ban dau cua doi tuong cong voi hang vi / trang thai mơi;
public class Program {
    public static void main(String[] args) {
        //de qui;
        System.out.println(new Egg(
                                new Fruit(
                                        new BlackSuger(
                                                new Bubble(
                                                        new MilkTea())))).cost() + "$");
        //đầu tiên nó tạo new Milktea;
        // sau do no tao Bubble va luu MilkTea vao IMilkTea của Bubble
        //sau no tao BlackSuger va luu Bubble vao IMilkTea cua BlackSuger
        //sau do no tao Fruit va luu Background vao IMilkTea cua Fruit
        //sau do no tao Egg va luu Fruit vao IMilkTea cua Egg
        // khi do Egg se goi method const()
        //Khi goi cost() trong Egg thi no se goi den super.cost(); nghia la no goi den cost() cua lop cha
        //trong khi do const cua lop cha lai lay tri cua thuoc tinh IMilkTea, luc nay IMilkTea cua Egg luu thg Fruit
        //nen no goi den const cua Fruit khi goi den cost cua fruit thi no lai goi den cost cua BlackSuger(day la gia
        // tri ma IMilkTea cua Fruit luu); cu nhu the cho den thg Bubble;
        //thg Bubble se lay gi tri cua MilkTea ma no luu gi den method cost va tra ve tong cua Bubble + MilkTea;
        //sau do lan luot trả lai cho cac thg o tren va ta duoc tong cua nó;
        System.out.println(new Egg(
                                new BlackSuger(
                                        new WhiteBubble(
                                                new MilkTea()))).cost() + "$");
    }
}
