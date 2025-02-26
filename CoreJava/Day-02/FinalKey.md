



## Final Keyword


### Final Variable

- Final variable is simply defining the constants
- Have the Variable name as all CAPITALS.

```java
final double PIE = 3.14;
```


### Final Method

- If a method is final method we cannot Override it further. 
- Used to keep a method functionality constant throughout the inheritance hierarchy


```java
class Animal {

    public final void animalSound() {
      System.out.println("The animal makes a sound");

    }
}
  
class Dog extends Animal {
    
  // This throws an error as the super class animalSound is final method  
  public void animalSound() {
    System.out.println("The dog says: bow wow");

  }
}

```

### Final Class

- If a class is final class it further cannot be extended.
- It is kind of like a restriction of inheritance for the class. 
- This ensures that the class implementation is final and prevents other classes from inheriting its behaviour.


```java
final class Animal {

    public void animalSound() {
      System.out.println("The animal makes a sound");

    }
}
  
 // This throws an error as Final class cannot be extended
class Dog extends Animal { 

}
```
