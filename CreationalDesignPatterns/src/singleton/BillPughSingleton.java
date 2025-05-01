package singleton;

public class BillPughSingleton {
    private BillPughSingleton(){
        System.out.println("Single Object Is Created: ");
    }

    @Override
    public String toString() {
        return "BillPughSingleton Object Created Once: ";
    }

    // Inner static class responsible for holding the Singleton instance
    private static class Helper{
        // The instance of BillPughSingleton is created when the class is loaded
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton factoryMethod(){
        return Helper.instance;
    }

    public static void main(String[] args) {
        BillPughSingleton obj1 = BillPughSingleton.factoryMethod();
        BillPughSingleton obj2 = BillPughSingleton.factoryMethod();
        System.out.println(obj1==obj2);
    }

}
