package singleton;
class DoubleCheck{
    private static volatile DoubleCheck instance;
    private DoubleCheck(){

    }
    public void display(){
        System.out.println("Object created once: ");
    }
    public static DoubleCheck getInstance(){
        if (instance == null){
            synchronized (DoubleCheck.class){
                if (instance==null){
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
public class SingletonDPDoubleCheck {
    public static void main(String[] args) {
        DoubleCheck instance = DoubleCheck.getInstance();
        instance.display();
    }
}
