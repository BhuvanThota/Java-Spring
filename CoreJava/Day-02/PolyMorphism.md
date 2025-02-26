


## PolyMorphism

- Poly -> Many; Morphism -> Forms;


- Different types of Polymorphism
    1. Compile Time - Early binding -> Method OverLoading
    2. Run Time - Late binding -> Method Overriding



### Dynamic Method Dispatch

- Dynamic Method Dispatch calls the method related to type of the object in the inheritance not related to the type of variable.


```java
class A{
    public void show(){
        System.out.println("In A Show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B Show");
    }
}

A obj = new A();
obj.show(); // In A Show


obj = new B();
obj.show(); // In B Show

```

