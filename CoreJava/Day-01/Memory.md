


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
_________________


## Stack and Heap

- The data is stored in JVM in form of stack or heap


### Stack

- The memory is stored in form of stack - > Last In First Out -> LIFO

- Every method will have its own stack memory


### Heap

- The memory is stored in random form -> 



### Memory as we compile the code

- The Main creates a stack

- The local variables are stored in stack

- The instance ref is stored in the stack

|Stack | Data|
|------|-----|
|main: |20   |
|a	   |10   |
|b	   |5    |
|c	   |6    |
|cal   |ref  |


- The Object/instance with the variable or methods are stored in the heap


cal - Obj<br\>
(  num | 5  )<br\>
(-----------)<br\>
( add() --- )<br\>



Eg:

```java
class Calc{


    public int add(int a, int b) {
        return a+b;
    }

    public int add(int a, int b, int c) {
        return a+b+c;
    }
}

public class Demo {
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int c = 6;

        Calc cal = new Calc();
        int res = cal.add(a,b,c);

        System.out.println(res);

    }
}
```

Memory Visualized:

<img src="image.png" alt="Memory Vizualized" max-width="300px" >

