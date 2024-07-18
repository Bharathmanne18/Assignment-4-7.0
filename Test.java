public class Test{
public static void main(String[]args){
// Create Object for Person
  // Initialize values with Constructors
  // print the values
  // Create another Object for Person
  // Assign Values with Getters & Setters
  // print the values
}
}
public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Test {
    public static void main(String[] args) {
        // Create Object for Person
        // Initialize values with Constructors
        Person person1 = new Person("Bharath", 25);
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        // Create another Object for Person
        // Assign Values with Getters & Setters
        Person person2 = new Person("XYZ");
        person2.setAge(22);
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
    }
}
