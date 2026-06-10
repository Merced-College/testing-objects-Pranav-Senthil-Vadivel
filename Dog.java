public class Dog {

    private String name;
    private int age;
    private String breed;

     public Dog(){ // default constructor

            name = "Unknown";
            age = 0;
            breed = "Mixed";
        }

        public Dog(String name, int age, String breed){ // parameterized constructor
            
            this.name = name;
            this.age = age;
            this.breed = breed;


            // Experiment: 
            //         The compile error was "The constructor Dog() is undefined" because after adding a paramaterized constructor, Java doesn't create the "Object.toString()"" method 
            //         anymore

            
        }

        @Override
            public String toString() {
                return "Dog{name = '" + name + "', age = " + age + ", breed = '" + breed + "'}";
                
            }


        public String getName() { 
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge(){
            return age;
        }

        public void setAge(int age){
            // simple gaurd (optional)
            if (age >= 0) this.age = age;
        }

        public String getBreed(){
            return breed;
        }
        public void setBreed(String breed){
            this.breed = breed;
        }
}




