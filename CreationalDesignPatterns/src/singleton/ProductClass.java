package singleton;
/*Thread safe Lazy Initialization: ✔️✔️*/
public class ProductClass {
    private static ProductClass instance = null;
    private ProductClass(){
        System.out.println("Only One Product Object is Created: ");
    }
    public static synchronized ProductClass factoryMethod(){
        if (instance == null){
            instance = new ProductClass();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "only one obj is created 😊😊😊 ";
    }
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            ProductClass obj1 = ProductClass.factoryMethod();
            System.out.println(obj1);
        });
        Thread thread2 = new Thread(() -> {
            ProductClass obj2 = ProductClass.factoryMethod();
            System.out.println(obj2);
        });

        thread1.start();
        thread2.start();
    }
}
