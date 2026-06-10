[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=24103944)
# testingObjectsWithJava

Write your answers to your reflection questions here. Write your name, the date and the answers.

Make sure to push your code to your repo!



Pranav Senthil Vadivel
06/09/2026
CPSC: 39 

Checkpoint Q1: 
Printing an object without the "toString()" method shows the class name followed by a hash code, Java uses the default Object.toString() method

Checkpoint Q2:
The default values for my fieldd were null for name, 0 for age ,and null for bree. age is a primitive type because it is an integer, while name and breed are reference types because they are strings

Checkpoint Q3: 
In part B, Java gave the fields default values like null and 0. After adding constructors, I was able to give the objects my own values when they were created. The default contructor gives preset values and the parameterized constructor lets me choose the values seperately 

Checkpoint Q4:
In part A, when I printed the object, it showed the class name and a hash code because Java was using the default Object.toString() method. In part D, after I added my own toString() method, it printed the dog's information instead. @Override is a useful tool because it tells Java that I am replacing an existing method and helps catch any misttakes that are made. 

Checkpoint Q5: 
Private fields are better because they stop data from being changed directly. Getters and Setters let me vontrol the values for each setting. For example, I can make sure age cannot be a negative number in setAge() because a living organism physically can't have age numbers that are negative due to it not making any sense. But this is how we tell Java because it doesn't necessarily know this information. 

Reflection Question 1: 
Before I added toString(), printing the object shows the class name and a hash code because Java was using the default Object.toString() method that is always used when there is no toString() method given by the user. 

Reflection Question 2: 
Encapsulation is better because it protects the data and lets me control how it is changed. One validation rule I could add is making sure the age cannot be set to a negative number like I have stated in Checkpoint Q5. 