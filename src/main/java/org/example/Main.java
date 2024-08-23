package org.example;

import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {


        SessionFactory session = Database.getSessionFactory();
        session.getSchemaManager().exportMappedObjects(true);

    }
}