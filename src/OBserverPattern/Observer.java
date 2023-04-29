package OBserverPattern;

import java.util.Objects;

//tao 1 moi quan he 1 nhieu giua cac object de khi 1 doi tuong thay doi trang thai, thi tat ca cac doi tuong phu thuoc
//vao no no duoc thong bao va auto update
//observer thg lm o duoi nen view de cap nhat giao dien khi 1 doi tuong thay doi trang thai;
//khi nao can su dung: 1 ta thay doi data cua 1 doi tuong va cac doi tuong phu thuoc vao no se tu dong thau doi theo;
//ta co the the hoac bot trang thai cua 1 doi tuong luc runtime;
public abstract class Observer extends Subject{
    Subject subject;
    public abstract void notification(Objects ar);
}
