package singleton;

public class EagerInitialization {
    private static final EagerInitialization Instance= new EagerInitialization();

    private EagerInitialization(){
        System.out.println("It has to be Eager Initialization: ");
    }

    public static EagerInitialization factoryMethod(){
        return Instance;
    }

    public static void main(String[] args) {
        EagerInitialization eagerInitialization1 = EagerInitialization.factoryMethod();
        EagerInitialization eagerInitialization2 = EagerInitialization.factoryMethod();
        System.out.println(eagerInitialization1 == eagerInitialization2);
    }
}

