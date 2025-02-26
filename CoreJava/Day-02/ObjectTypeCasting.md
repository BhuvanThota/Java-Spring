

## Object Classs Methods

### toString()

- Thi returns getClass().getName() + "@" + Object.hashCode()

### equals()

- This compares the hashCode of two objects but not the contents of the object


- This is better to implement these methods for our class with the memVars, with the inbuilt IDE generator.

_______________________


## Type Casting

- Java allows Lower to Higher Order casting by default


### Upcasting

- To have a Parent object reference be initialized with child object
- This is default for java no need to mention it.
- It is like assigning a Int value to Double variable - Java handles this conversion
- Child object is assigned to Parent Reference

```java
class A{
    public void show1(){
        System.out.println("In A Show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In B Show");
    }
}

// Upcasting
A obj = new B();
obj.show1();

```

### DownCasting

- To have a child Object reference be initialized with a parent object
- This need to be exlicitly mentioned in java
- It is like assigning a Double value to a Int variable - Need to Cast
- Parent Object is assigned to child reference

```java
class A{
    public void show1(){
        System.out.println("In A Show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In B Show");
    }
}

// Upcasting
A obj = new B();
obj.show1();


B obj2 = (B) obj;
obj2.show2();
```

___________________