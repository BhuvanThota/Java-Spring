



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
