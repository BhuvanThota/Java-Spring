

## Static Keyword

- The static keyword in Java is used to share the same variable or method of a given class.

- Static is applicable to:
    1. Blocks
    2. Variables
    3. Methods
    4. Classes

### Static Variable

- The static variables or methods are saved separate to the object instance in the memory.

- The static variables are called with the class name not the object name


- Regular Code

```java
class Mobile{

    String brand;
    int price;
    String type;
}

Mobile mob1 = new Mobile();
mob1.brand = "Apple";
mob1.price = 100;
mob1.type = "Smartphone";
```

- Static Implemented Code

```java
class Mobile{

    String brand;
    int price;
    static String type;
}

Mobile mob1 = new Mobile();
mob1.brand = "Apple";
mob1.price = 100;

Mobile.type = "Smartphone";
```



### Static Method

- Static Methods are methods class specific methods which mostly do not need a instance/object to be called.

- Regular Code

```java
class Mobile{

    String brand;
    int price;
    String type;

    public void show(){
        System.out.println(brand + " : " + price + " : "+ type);
    }
}

Mobile mob1 = new Mobile();
mob1.brand = "Apple";
mob1.price = 100;
mob1.type = "Smartphone";
```



- Static Implemented Code

```java
class Mobile{

    String brand;
    int price;
    static String type;

    public void show(){
        System.out.println(brand + " : " + price + " : "+ type);
    }

    public static void showStatic(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : "+ type);
    }
}

Mobile mob1 = new Mobile();
mob1.brand = "Apple";
mob1.price = 100;

Mobile.type = "Smartphone";
Mobile.showStatic(mob1);
```

### Static Block


- To initialize all the static variables once at the start of the code we have static block


```java
class Mobile{

    String brand;
    int price;
    static String type;

    static{
        type = "SmartPhone";
    }

    Mobile(String brand, int price){
        this.brand = brand;
        this.price = price;
    }


    public void show(){
        System.out.println(brand + " : " + price + " : "+ type);
    }

    public static void showStatic(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : "+ type);
    }
}

Mobile mob1 = new Mobile("Apple", 100);

Mobile.showStatic(mob1);
```

#### Class Loader

- To call the class even without creating an instance

```java
Class.forName("ClassName");
```

_______________



## Encapsulation


- The way to handle the access of the varMem of the class using private and handling the getters and setters is Encapsulation

- This helps in data hiding and gives control for the class data.

 
### Getter and Setter

- The way of handling how the private varMem in the class are handled. 


### This Keyword

- when we have same name for the method arg in a class as the class memVar we can use this.memVar to specify that we are using the Class variable.


```java

class Mobile{

    private String brand;
    private int price;

    public String getBrand(){
        return this.brand;
    }

    public int getPrice(){
        return this.price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void show(){
        System.out.println(getBrand() + " : " + getPrice());
    }
}


Mobile mob1 = new Mobile();

mob1.setBrand("Apple");
mob1.setPrice(100);

mob1.show();
```

________________


## Constructors

- The class method which is called to initial default values for a class on creating a class object


### Constructor Overloading

- To have multiple constructors with diff set of args. 


```java
class Mobile{

    private String brand;
    private int price;

    public Mobile(){
        brand = "Apple";
        price = 100;
    }

    public Mobile(String brand){
        this();
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getPrice(){
        return this.price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void show(){
        System.out.println(getBrand() + " : " + getPrice());
    }
}

Mobile mob1 = new Mobile();

Mobile mob2 = new Mobile("Samsung");

```


__________________

## Naming Conventions

- Camel Casing ==> CatAndTom

<ol>
<li> Class and Interface - Calc, Mobile</li>
<li> variable and methods - marks, totalMarks, showMyMarks()</li>
<li> constants, FINAL - PIE, TYPE</li>
</ol>
__________________



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

__________________


