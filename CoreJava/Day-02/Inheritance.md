



## Inheritance

- It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class.

- We group the "inheritance concept" into two categories:
    - subclass (child) - the class that inherits from another class
    - superclass (parent) - the class being inherited from

- To inherit from a class, use the extends keyword.


```java
class Vehicle {
  ...
}

class Car extends Vehicle {
  ...
}
```


#### Why Do We Need Java Inheritance?
- Code Reusability: The code written in the Superclass is common to all subclasses. Child classes can directly use the parent class code.

- Method Overriding: Method Overriding is achievable only through Inheritance. It is one of the ways by which Java achieves Run Time Polymorphism.

- Abstraction: The concept of abstract where we do not have to provide all details, is achieved through inheritance. Abstraction only shows the functionality to the user.



### Multi-Level Vs Multiple Inheritance

#### Multi-Level Inheritance

- When we have a Class inherited from a class and soo on this is called multi level inheritance. 

- Eg:  A ==>> B ==>> C

- In this B inherits from A, and C inherits from B. which means It also Inherits A.


```java
class A {
  ...
}

class B extends A {
  ...
}

class C extends B {
  ...
}
```


#### Multiple Inheritance

- If in above C inherits both A and B, Is it having multiple inheritance

-> No This is not Multiple Inheritance

```java
class A {
  ...
}

class B {
  ...
}

// This is not Possible in Java 
class C extends A, B {
  ...
}
```

- This does not work in java because of ambiguity problem

- Java does not allow the Multiple Inheritance



________________


## Super Keyword

- The super keyword refers to superclass (parent) objects.

- The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.


```java
class Animal { // Superclass (parent)
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Dog extends Animal { // Subclass (child)
  public void animalSound() {
    super.animalSound(); // Call the superclass method
    System.out.println("The dog says: bow wow");
  }
}

public class Main {
  public static void main(String args[]) {
    Animal myDog = new Dog(); // Create a Dog object
    myDog.animalSound(); // Call the method on the Dog object
  }
}
```
Output:
The animal makes a sound
The dog says: bow wow
_______