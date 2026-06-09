public class Main {
    public static void main(String[] args){

        Dog dog1 = new Dog();

        // A2: Print the object directly.
        System.out.println("Printing dog1 directly:");
        System.out.println(dog1);

        // Checkpoint Q1: Printing an object without the "toString()" method shows the class name followed by a hash code, Java uses the default Object.toString() method

        Dog d1 = new Dog();
        System.out.println("\nDefaults for d1 fields (before any assignments):");
        System.out.println("name = " + d1.name); // expected: null ---- Printed: null (Reference type)
        System.out.println("age = " + d1.age); // expected 0 ---- Printed: 0 (Primitive type)
        System.out.println("breed = " + d1.breed); // expected: null ----- Printed: null (Primitive type)

        Dog d2 = new Dog(); // uses default constructor values
        System.out.println("\nd2 after default constructor:");
        System.out.println("name = " + d2.name + ", age = " + d2.age + ", breed = " + d2.breed);

        Dog d3 = new Dog("Rex", 4, "Collie"); // uses parameterized constructor
        System.out.println("\nd3 after paramterized constructor: ");
        System.out.println("name = " + d3.name + ", age = " + d3.age + ", breed = " + d3.breed);
    }
}