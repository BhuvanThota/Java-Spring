

# Inner Class

- We can have nested classes this is mainly done to group classes together for more readablity.


- To access the inner class, create an object of the outer class, then create an object of the inner class

```java
class Car{
    
    String name;
    
    public void drive(){
    
        System.out.println("Driving...");
    
    }

    class CarSettings{

        public void carRefuel(){
        
            System.out.println("Refueling...");
        
        }
    }
}


Car audi = new Car();

audi.drive()

Car.CarSettings audiSettings = audi.new CarSettings();
```



## Static Inner Class

- An inner class can also be static, which means that you can access it without creating an object of the outer class

```java

class Car{
    
    String name;
    
    public void drive(){
    
        System.out.println("Driving...");
    
    }

    static class CarSettings{

        public void carRefuel(){
        
            System.out.println("Refueling...");
        
        }
    }
}


Car audi = new Car();

audi.drive()

Car.CarSettings audiSettings = new Car.CarSettings();
```


___________________


## Anonymous Inner Class


- To method override specifically for a object, instead of creating a separate class we can do that while object intializing.



```java
class Car{
    
    String name;
    
    public void drive(){
    
        System.out.println("Driving...");
    
    }

}

// main
Car audi = new Car(){
    public void drive(){
    
        System.out.println("Driving Audi Car...");
    
    }
};

audi.drive();

```

_______________

## Abstracr Anonymous Inner Class

- To create a anonymous inner class of a abstract class instead of creating a new class.


```java
abstract class Car{
    
    abstract public void drive();    
    
}

// main
Car audi = new Car(){
    public void drive(){
    
        System.out.println("Driving Audi Car...");
    
    }
};

audi.drive();

```








