

# Interface

## What is Interface
- An interface is a completely "abstract class" that is used to group related methods with empty bodies.


- Instead of abstract for empty methods
```java
abstract class Car{
    
    abstract public void drive();    
    
}
```

- We declare the Interface
```java
interface Car{
    void drive();
}
```

___________

## How to use Interface

- To use the Interface we need to "implement" this to a inherit class

- Instead of "extends" for a inherited class, we need to use "implements" key for the Interface.



```java
interface Car{

    void drive();

}

class SportsCar implements Car{

    public void drive(){
        System.out.println("Driving SportsCar...");
    }
}

// main
SportsCar lambo = new SportsCar();

lambo.drive();


```

_____________


## Interface Member Variables

- The memvars we declare in the Interface are "final and static"

- So when we have static memVars, these could be accessed directly fromt he Interface, even without creating any objects


```java
interface Car{

    int topSpeed = 500;

    void drive();

}

class SportsCar implements Car{

    public void drive(){
        System.out.println("Driving SportsCar...");
    }
}

// main
SportsCar lambo = new SportsCar();

lambo.drive();

System.out.println("Top Speed:" + Car.topSpeed );
```

_______________


## Multiple Interfaces

- A class could have multple interfaces
- Unlike classes we can have multiple interfaces

- We need to define all the methods of the multiple interfaces


```java
interface Car{
    void drive();
}

interface LuxuryItem{
    void value();
}

class SportsCar implements Car, LuxuryItem{
    public void drive(){
        // method body
    }

    public void value(){
        //method body
    }
}
```
________________________

## Multi Level Interfaces

- A interface can have a sub-interface as well.
- To inherit from one interface to another we need to use "extends".

```java
interface Vehicle{

}

interface Car extends Vehicle{

}
```
______________________


## Types of Interface

- Normal - Two or more methods

- Functional / SAM = Single Abstract Method - Single method 

- Marker - No Methods - Blank Interface

________________

## Functional interface

```java
// Define a functional interface
@FunctionalInterface
interface Square {
    int calculate(int x);
}

class Geeks {
    public static void main(String args[]) {
        int a = 5;

        // lambda expression to 
        // define the calculate method
        Square s = new Square(){
            public int calculate(int x){
                return x *x;
            }
        } 

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}

```
____________________


## Lambda Expression

```java
@FunctionalInterface
interface Square {
    int calculate(int x);
}

class Geeks {
    public static void main(String args[]) {
        int a = 5;

        // lambda expression to 
        // define the calculate method
        Square s = (int x) -> x * x;

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}


```







