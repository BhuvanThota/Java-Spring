

# Enum

- An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

- To get the value we use .ordinal()

```java
enum Status{
    Running, Failed, Pending, Success;
}

// main
Status current = Status.Success;
System.out.println(current); // Success

System.out.println(current.ordinal()); // 3

```
_________________

## Switch Enum

- When we need to do If-else it is better to use switch as no need to use "obj.value".


```java
enum Level {
  LOW,
  MEDIUM,
  HIGH
}


// main
Level myVar = Level.MEDIUM;

switch(myVar) {
    case LOW:
    System.out.println("Low level");
    break;
    case MEDIUM:
        System.out.println("Medium level");
    break;
    case HIGH:
    System.out.println("High level");
    break;
}

```
________________

## Enum Class

- Just like any class in java Enum can have constructors or methods or memVars.

- Only diff to regualr class is, enum cannot be extended or inherited.


```java

enum Mobile{
  Apple(1000), Samsung(900), Oneplus(700), Google(750);

  private int price;

  private Mobile(int price){
    this.price = price;
  }

  public int getPrice(){
    return this.price;
  }
  
  public void setPrice(int price){
    this.price = price;
  }
}

// main
Mobile[] phones = Mobile.values();

for( Mobile phone: phones){
    System.out.println(phone + " : " + phone.getPrice());
}

```

__________________

