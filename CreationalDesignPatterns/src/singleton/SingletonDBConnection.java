package singleton;
/// Double check with lazy initialization:
public class SingletonDBConnection {
    private static volatile SingletonDBConnection instance = null;
    private static final Object lock = new Object();

    private SingletonDBConnection(String string) {
        System.out.println("Only One instance is created: " + string);
    }

    @Override
    public String toString() {
        return "SingletonDBConnection object";
    }

    public static SingletonDBConnection factoryMethod() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new SingletonDBConnection("Single");
                } else {
                    System.out.println("you cant create Another Object ");
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonDBConnection obj1 = SingletonDBConnection.factoryMethod();
        SingletonDBConnection obj2 = SingletonDBConnection.factoryMethod();
        System.out.println(obj1 == obj2);

    }
}
