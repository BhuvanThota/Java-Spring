

# Abstract

- It is to hide certain details and showing only essential information to the user


## Abstract Class

- It is a restricted class that cannot be used to create objects -> to access it, it must be inherited from another class.

## Abstract Method

- It can only be used in an abstract class and it does not have a body. 
- The body is provided by the subclass.

```java

abstract class Car{

    public abstract void drive();

    public void fly(){
        System.out.println("Car is flying...");
    }

}

class SportsCar extends Car{

    public void drive(){
        System.out.println("Driving...");
    }
}

SportsCar lambo = new SportsCar();

```



