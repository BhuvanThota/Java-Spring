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

        // To save the data into Db
        // org.configuration.hib
//        Configuration hibcfg = new Configuration();
//        hibcfg.addAnnotatedClass(com.talesofb.Student.class);
//        hibcfg.configure();
//        hibcfg.buildSessionFactory();

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

