public class Person{
// Take 4 fields
  //Create Getters and Setters
  // Implement Constructor argumented
  // Include private
}
public class person {
    public  String name;
    public int age;

    public person(String name) {
        this.name = name;
    }
        public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getage() {
        return age;
    }public class main {
    public static void main(String[] args) {
        // Create Object for Person
        // Initialize values with Constructors
        person person1 = new person("Bharath", 25);
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getage());

        // Create another Object for Person
        // Assign Values with Getters & Setters
        person person2 = new person("sggh",23);
        person1.getName();
        person2.getage();
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getage());
    }
}


}
