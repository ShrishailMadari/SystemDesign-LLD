package singleton;
class SingleDBConnection{
    private static SingleDBConnection connection;
    private SingleDBConnection(){

    }

    public static synchronized SingleDBConnection factoryMethod(){
        if (connection==null){
            connection = new SingleDBConnection();
            System.out.println("Single Connection: ");

        }
        return connection;
    }
}
public class SingletonDPSynchronized {
    public static void main(String[] args) {
        SingleDBConnection connection = SingleDBConnection.factoryMethod();
        System.out.println(connection);
    }
}
