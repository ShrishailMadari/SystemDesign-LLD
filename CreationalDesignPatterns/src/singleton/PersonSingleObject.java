package singleton;
class Person{

    private static Person personInstance;
    private int id;
    private String name;
    private int age;
    private String city;


    public String display() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    private Person(int id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public static Person getInstance(int id,String name,int age, String city){
        if (personInstance == null){
            personInstance = new Person(id,name,age,city);
        }
        return personInstance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
public class PersonSingleObject {
    public static void main(String[] args) {
        Person instance1 = Person.getInstance(101, "ShriHari", 100, "vaikunta");
        System.out.println(instance1.display());
//      this second object is not able to create since single object has to be created
        Person instance2 = Person.getInstance(102,"Krishna",1000,"Gokula");
        System.out.println(instance2.display());

    }
}
