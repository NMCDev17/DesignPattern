package SingleTonPattern;

public class Program extends Thread {
    public static void main(String[] args) {
        Program program = new Program();
        program.start();
        Program program2 = new Program();
        program2.start();
    }


    public void run() {
        SingletonCuongDev.getInstance().hi();
    }
}
