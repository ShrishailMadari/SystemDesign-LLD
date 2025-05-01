package singleton;
//By default, enums are singleton
// creation of private constructor happens internally
public enum EnumSingleton {
    ENUM_SINGLETON; // this makes sure that only one instance is created for jvm instance

    // Add any methods you want to use in your Singleton
    public void display(){
        System.out.println("Singleton enum: ");
    }

    public static void main(String[] args) {
        EnumSingleton obj1 = EnumSingleton.ENUM_SINGLETON;
        EnumSingleton obj2 = EnumSingleton.ENUM_SINGLETON;
        obj2.display();
        System.out.println(obj2==obj1);

    }
}
