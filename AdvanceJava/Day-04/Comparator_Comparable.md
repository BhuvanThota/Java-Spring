

## Comparator

- It is a Interface by which we can give our own logic for the sorting of the List or Collection

```java
// Compare logic based on the last digit
Comparator<Integer> com = new Comparator<Integer>() {
    public int compare(Integer i, Integer j){
      return (i>j? 1: -1);
    }
};


List<Integer> nums = new ArrayList<>(); 
nums.add(70);
nums.add(96);
nums.add(33);
nums.add(18);
nums.add(16);

System.out.println(nums); // [70, 96, 33, 18, 16]

// We need to pass in the Comparator Object.
nums.sort(com);

System.out.println(nums); // [70, 33, 16, 96, 18]

```

__________________________

## Comparable

- For the sorting of Primitives we use the Comparator

- But for the sorting of list of class objects we need to use the Comparable Interface

- It works more like we say the class itself what to be compared on.


```java
import java.util.*;


class Student implements Comparable<Student>{
  int age;
  String name;

  public Student(int age, String name){
    this.age = age;
    this.name = name;
  }

  
  @Override
  public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
  }

  // For sorting order based on age
  @Override
  public int compareTo(Student obj) {
    return (this.age > obj.age? 1 : -1);
  }

  
}

public class Demo {
  public static void main(String args[]) throws InterruptedException {

    List<Student> students = new ArrayList<>(); 

    students.add(new Student(20, "Bhuvan"));
    students.add(new Student(17, "Nani"));
    students.add(new Student(16, "Pandu"));
    students.add(new Student(19, "Keerthi"));

    for (Student s: students){
      System.out.println(s);
    };
    // Output    
        // Student [age=20, name=Bhuvan]
        // Student [age=17, name=Nani]
        // Student [age=16, name=Pandu]
        // Student [age=19, name=Keerthi]

    System.out.println();

    // This works only if, implemented Comparable Interface for the class.
    Collections.sort(students);
    
    for (Student s: students){
      System.out.println(s);
    };
    //Output
        // Student [age=16, name=Pandu]
        // Student [age=17, name=Nani]
        // Student [age=19, name=Keerthi]
        // Student [age=20, name=Bhuvan]

  }
}

```




