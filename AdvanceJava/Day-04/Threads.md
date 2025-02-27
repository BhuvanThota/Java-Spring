

# Threads

- Every system does multi-tasking with multiple applications
- Every application have multi-tasking with multiple tasks in same app too.
- So if we zoom down to the application inside it is called threads just like in a garment the most basic component is thread.
- Do to make a application we runt he code in application in a thread format
- In java it allows to run multiple threads at a same time.


## Thread Class 

- Making a class thread using extends

```java
class A extends Thread{ // Thread class

    // For a thread class run() is like main()
    public void run(){
        for(int i=1; i<=100; i++){
            System.out.println("A block - Hi");
        }
    }
}

class B extends Thread{

    public void run(){
        for(int i=1; i<=100; i++){
            System.out.println("B block - Hello");
        }
    }
}

// main()

A obj1 = new A();
B obj2 = new B();

obj1.start();
obj2.start();
```

______________

##  Thread Priority

- Lowest priority is of level 1 - MIN
- Normal priority is of level 5 - DEFAULT - NORMAL
- Highesh priority is of level 10 - MAX

- Higher the priority the faster the thread is executed

```java
A obj1 = new A();
B obj2 = new B();

System.out.println(obj1.getPriority());

// Making obj1 highest priority
Obj1.setPriority(Thread.MAX_PRIORITY);

obj1.start();

obj2.start();
```

_________________


## Thread Sleep

- To give some delay for the Thread to execute 

```java
try {
    Thread.sleep(10);
} catch (InterruptedException e) {
    e.printStackTrace();
}
```

_____________________

## Thread Interface

- To make a class Thread using interface

- Need to make class Implement using Runnable, create object and then pass them into Thread Class object, finally start the thread objects
```java
class A implements Runnable{ // Thread class

  // For a thread class run() is like main()
  public void run(){
      for(int i=1; i<=100; i++){
          System.out.println("A block - Hi");
      }
  }
}

class B implements Runnable{

  public void run(){
      for(int i=1; i<=100; i++){
          System.out.println("B block - Hello");
      }
  }
}

// main
Runnable obj1 = new A();
Runnable obj2 = new B();

Thread t1 = new Thread(obj1);
Thread t2 = new Thread(obj2);

t1.start();
t2.start();

```

__________________________

## Race Condition due to multi-thread

## Threads join

- To make the code to execute after the threads wee need to use 'join' method

## Synchronized 

- To run the modifying or updating methods to be run one at a time by the multi thread.

```java

class Counter {
  int count;

  public synchronized void increment() {
    count++;
  }

  public void show() {
    System.out.println(count);
  }
}

public class Demo {
  public static void main(String args[]) throws InterruptedException {

    Counter c = new Counter();

    Runnable obj1 = () -> {
      for (int i = 1; i <= 1000; i++) {
        c.increment();
      }
    };

    Runnable obj2 = () -> {
      for (int i = 1; i <= 1000; i++) {
        c.increment();
      }
    };

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    c.show();

  }
}

```

__________________________________


## Thread States

- Types of Thread states
    1. New
    2. Runnable
    3. Running
    4. Waiting
    5. Dead


-Thread Life cycle

    1. When we create a Thread object -> New 

    2. When we start() a thread -> New --> Runnable

    3. When we have run() -> Runnable --> Running

    4. When we use sleep()/ wait() -> Running --> Waiting

    5. After wait or sleep done -> Waiting --> Runnable

    6. When we say stop() -> Any --> Dead


_______________________