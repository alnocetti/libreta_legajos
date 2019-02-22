package com.libreta.servidor.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.libreta.servidor.entities.DireccionEntity;
import com.libreta.servidor.entities.PersonaEntity;


public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    static 
    {
        try
        {
        	AnnotationConfiguration config = new AnnotationConfiguration();
            
            config.addAnnotatedClass(PersonaEntity.class);
            config.addAnnotatedClass(DireccionEntity.class);
  
            sessionFactory= config.buildSessionFactory();
            
        }catch(Throwable ex)
        {
           
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
}

