


## Arrays

- To save index based elements in order


```java
int nums[] = {3,7,2,4};


int nums2[] = new int[4]; // default values of zeroes
```

### Multi-Dimensional Arrays

- Uniformed array with every row of same length

```java
int mat[][] = {{1,2,3}, {4,5,6}, {6,7,8}};

int mat2[][] = new int[3][3];
```

_______________


### Jagged Array

- Random size row array with every row of different length


```java
int mat[][] = new int[3][];

mat[0] = new int[3];
mat[1] = new int[4];
mat[2] = new int[2];


for (int i = 0; i < mat.length;i++){

    for (int j = 0; j< mat[i].length; j++){

        mat[i][j] = (int) (Math.random() *100); 
    }
}

for (int m[]: mat ){

    for (int i : m){

        System.err.print(i + " ");
    }
    System.err.println();
}

System.err.println();
System.out.println(mat[2][1]);
```


### Array Objects

- To have a array of objects 

```java
class Student{

    int rollno;
    String name;
    int marks;


    Student (int rollno, String name, int marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

}

public class Demo {
    public static void main(String[] args){

        Student s1 = new Student(1, "Bhuvan",69);
        Student s2 = new Student(2, "Pandu",96);
        Student s3 = new Student(3, "Bngrm",78);

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        System.out.println(students[1].name);
    }
}
```
