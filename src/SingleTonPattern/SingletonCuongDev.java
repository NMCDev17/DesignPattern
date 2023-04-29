package SingleTonPattern;

public class SingletonCuongDev {
    private int index;
    private static SingletonCuongDev cuongdev;
    private SingletonCuongDev(int index) {
        this.index = index;
    }

    //synchronize dong bo cac luong sao cho 1 luong dang chay 1 thg thuc thi luong khac khong dc chay;
    public static synchronized SingletonCuongDev getInstance()
    {
        if(cuongdev == null)
        {
            int index = (int)(Math.random() * 2) + 1;
            cuongdev = new SingletonCuongDev(index);
        }
        return cuongdev;
    }

    public void hi()
    {
        System.out.println("hello everyone! I am Cuongdev number: " + this.index);
    }
}
