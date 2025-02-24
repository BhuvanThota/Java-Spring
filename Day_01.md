
# Core Java

## Object - Oriented Programming

### Java Class

- The class contains methods and variables


```java
class Calc{

    public int add(int a, int b) {
        System.out.println("in add");
        return a+b;
    }
}

Calc c = new Calc();
int res = c.add(a,b);

System.out.println(res);
```

________


## JDK - JRE - JVM

- JDK --> JRE --> JVM

- We write and edit the code in the JDK
- We compile the code in the JRE
- We execute the code in the JVM

_____________


## Method Overloading

- If we need a function to add two nums or three nums?

- For this we could have same method name but with different parameters

- We need to have same return type and method name.

```java
class Calc{


    public int add(int a, int b) {
        return a+b;
    }

    public int add(int a, int b, int c) {
        return a+b+c;
    }
}
```













