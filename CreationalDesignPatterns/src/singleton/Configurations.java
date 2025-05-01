package singleton;
/*
* ✅ How Singleton ensures only one instance:
❌ The constructor is private:

So, you cannot do new Configurations() from outside.

This prevents creating multiple objects manually.

✅ A public static method (like factoryMethod()) is the only way to access the instance:

It checks if instance is null.

If yes, it creates it.

If not, it returns the already created one.

✅ The instance itself is stored as a private static variable:

static ensures it's shared across all calls.

private ensures no external access.

This is exactly how Singleton Design Pattern ensures only one instance is ever created*/


//Your current singleton implementation is:
//
//🟢 Lazily Initialized
//❌ Not Thread-Safe
public class Configurations {
    private static Configurations instance = null;
    private Configurations(){
        System.out.println("Single Instance of the Configurations:) ");
    }
    public static Configurations factoryMethod(){
        if (instance == null){
            instance =  new Configurations();
        }
        return instance;
    }

    public static void main(String[] args) {
        Configurations configurations1 = Configurations.factoryMethod();
        Configurations configurations2 = Configurations.factoryMethod();
        System.out.println(configurations1==configurations2);
    }
}
