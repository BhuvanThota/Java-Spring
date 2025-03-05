

# Hibernate

- It is ORM Framework of Java -> Object Relational Mapping Framework 

- It makes it easy for accessing and usage of Databases.

___________________
___________________

## To ADD or UPDATE data in DataBase (Postgres)


1. We need to Import the Dependencies

```java
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>HibProj</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <!-- https://mvnrepository.com/artifact/org.hibernate.orm/hibernate-core -->
        <dependency>
            <groupId>org.hibernate.orm</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>6.6.4.Final</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.postgresql/postgresql -->
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <version>42.7.4</version>
        </dependency>


    </dependencies>

    <properties>
        <maven.compiler.source>21</maven.compiler.source>
        <maven.compiler.target>21</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

</project>
```
__________________________________

2. We need the `hibernate.cfg.xml` in the resources


```java
<hibernate-configuration xmlns="http://www.hibernate.org/xsd/orm/cfg">
    <session-factory>

        <property name="hibernate.connection.driver_class">org.postgresql.Driver</property>

        <property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/javaproject</property>
        <property name="hibernate.connection.username">postgres</property>
        <property name="hibernate.connection.password">12345678</property>

        <property name="hibernate.hbm2ddl.auto">update</property>

        <!-- To see SQL query -->
        <property name="hibernate.show_sql">true</property>
        <property name="hibernate.format_sql">true</property>


    </session-factory>
</hibernate-configuration>
```
____________________________

3. Assume we have Student class 

```java
package com.talesofb;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private int rollNo;

    private String sName;

    private int sAge;

    public int getRollNo() {
        return rollNo;
    }

    public String getsName() {
        return sName;
    }

    public int getsAge() {
        return sAge;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }


    public Student() {
    }

    public Student(int rollNo, String sName, int sAge) {
        this.rollNo = rollNo;
        this.sName = sName;
        this.sAge = sAge;
    }


    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                '}';
    }


}

```

_________________________________

4. This is how we save the data into the db from the main.java

```java
package com.talesofb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args)
    {

        Student s1 = new Student(21, "Meenu", 19);

        System.out.println(s1);

//        To save the data into Db
//        org.configuration.hib


//        Configuration hibcfg = new Configuration();
//        hibcfg.addAnnotatedClass(com.talesofb.Student.class);
//        hibcfg.configure();
//        SessionFactorry sf = hibcfg.buildSessionFactory();

//      Rewrite above line in one line
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.talesofb.Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(s1);

        transaction.commit();

        // To close the Session and SessionFactory
        session.close();
        sf.close();


        System.out.println("Commited to Db!");
    }
}
```











