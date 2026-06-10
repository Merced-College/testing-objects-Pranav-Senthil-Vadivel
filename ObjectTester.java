public class ObjectTester {
    public static void main(String[] args){

        Dog dog1 = new Dog();

        // A2: Print the object directly.
        System.out.println("Printing dog1 directly:");
        System.out.println(dog1);

        // Checkpoint Q1: Printing an object without the "toString()" method shows the class name followed by a hash code, Java uses the default Object.toString() method

        Dog d1 = new Dog();
        // Checkpoint Q2:
        System.out.println("\nDefaults for d1 fields (before any assignments):");
        System.out.println("name = " + d1.getName()); // expected: null ---- Printed: null (Reference type)
        System.out.println("age = " + d1.getAge()); // expected 0 ---- Printed: 0 (Primitive type)
        System.out.println("breed = " + d1.getBreed()); // expected: null ----- Printed: null (Reference type)

        Dog d2 = new Dog(); // uses default constructor values
        System.out.println("\nd2 after default constructor:");
        System.out.println("name = " + d2.getName() + ", age = " + d2.getAge() + ", breed = " + d2.getBreed());

        Dog d3 = new Dog("Rex", 4, "Collie"); // uses parameterized constructor
        System.out.println("\nd3 after paramterized constructor: ");
        System.out.println("name = " + d3.getName() + ", age = " + d3.getAge() + ", breed = " + d3.getBreed());

        // Checkpoint Q4: Part A showed the class name and a hash code because Java was using the default Object.toString method. In part D after the toString() method has been added, it printed the dogs information correctly.
        // @Override is useful because it allows Java to know that I am replacing an exisiting method and considers teh following to be more superior and make sures to catch any mistakes if I do anything wrong
        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("\nMutating public fields directly:");
        // d3.age = 5; // direct write
        // d3.name = "Max"; // direct write
        System.out.println("After mutation, d3 =" + d3); // uses toString()

        System.out.println("\nMutating via setters after making fields private:");
        d3.setAge(6);
        d3.setName("Maxwell");
        d3.setBreed("Border Collie");
        System.out.println("d3 age via getter = " + d3.getAge());
        System.out.println("d3 now = " + d3);

        // Checkpoint Q5: Private fields are better because they stop data from being changed directly. Getter and setters let me control the values. This way I can make sure age cannot be a negative number in setAge()


        // For Car.java class file (My Own)

        System.out.println("\nTesting Car class:");

        Car car1 = new Car();
        System.out.println(car1);

        
        Car car2 = new Car("Cadillac", "CT5 V-Blackwing", 2024);
        System.out.println(car2);

        car2.setYear(2026);
        car2.setModel("Rivian");

        System.out.println("Updated car: " + car2);

    }
}