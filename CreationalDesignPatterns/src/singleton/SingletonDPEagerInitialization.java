package singleton;
class DBConnection{
    private static DBConnection object = new DBConnection();
    private DBConnection(){

    }
    public static DBConnection factoryMethod(){
        System.out.println("Object created only once: )");
        return object;

    }
}
public class SingletonDPEagerInitialization {
    public static void main(String[] args) {
        DBConnection.factoryMethod();
        DBConnection.factoryMethod();
    }

}
