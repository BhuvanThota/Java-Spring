package Basics;


class Animal {
    public void animalSound() {

      System.out.println("The animal makes a sound");

    }
}
  
class Dog extends Animal { 
  public void animalSound() {

    System.out.println("The dog says: bow wow");

  }
}
  
public class Demo {
  public static void main(String args[]) {

    Animal myDog = new Animal();     
    myDog.animalSound(); 


    myDog = new Dog();
    myDog.animalSound(); 



  
  }
}



