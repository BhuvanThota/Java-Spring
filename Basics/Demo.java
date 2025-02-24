package Basics;

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

        Student s1 = new Student(1, "A",69);
        Student s2 = new Student(2, "B",96);
        Student s3 = new Student(3, "C",78);

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // System.out.println(students[1].name +": "+ students[1].marks);



    }
}


