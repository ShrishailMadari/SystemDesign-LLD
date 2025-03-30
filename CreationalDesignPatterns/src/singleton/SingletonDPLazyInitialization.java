package singleton;
class PrimMinister{
    private static  String pm = null;
    private PrimMinister (){

    }
    public static String factoryMethod(){
        if (pm==null){
            pm = "new prime minister got Elected :❤️❤️❤️❤️❤️❤️";
            System.out.println("New PM,,,😍😍😍");
        }
        else System.out.println("PM is Elected Only Once ");
        return pm;
    }
}
public class SingletonDPLazyInitialization {

    public static void main(String[] args) {
        String string = PrimMinister.factoryMethod();
        System.out.println(string);
        PrimMinister.factoryMethod();
    }

}
