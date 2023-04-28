package com.telusko.Demo_Hib;



import java.util.Random;


import org.hibernate.Session; 
import org.hibernate.SessionFactory;


import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    /*	Laptop laptop = new Laptop();
    	laptop.setLid(101);
    	laptop.setLname("Dell");
    	
    	Student s = new Student();
    	s.setRollNo(1);
    	s.setSname("Navin");
    	s.setMarks(50);
    	//s.setLaptop(laptop);
    	s.getLaptop().add(laptop);
    	
    	laptop.getStudent().add(s); */
    	/*
    	
    	Alien a = null;
    	
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class).addAnnotatedClass(Alien.class);
    	
    	
    	SessionFactory sf = con.buildSessionFactory();
    	
    	Session session1 = sf.openSession();
    
    	
    	session1.beginTransaction();
    	
         Query q1 = session1.createQuery("from Alien where aid=101");
         q1.setCacheable(true);
    
    	
    	//Alien a1 = session.get(Alien.class, 101);
    	
    	//a = (Alien) session1.get(Alien.class, 101);
          a = (Alien) q1.uniqueResult();
    	
    	   System.out.println(a);
    	
      
    	
//    	 session.save(laptop);
//    	session.save(s); 
    	
    	//telusko = (Alien) session.get(Alien.class, 101);
    	
    	session1.getTransaction().commit();
    	session1.clear(); // here i closed the 1st session
    	
    	// here we using 2nd session 
    	
    	Session session2 = sf.openSession();
        session2.beginTransaction();
    	
       Query q2 = session2.createQuery("from Alien where aid=101");
       q2.setCacheable(true);
    
       a = (Alien) q2.uniqueResult();
    	
    	
    	//a = (Alien) session2.get(Alien.class, 101);
    	
    	System.out.println(a);
    	
        
    	
    	// session.save(laptop);
    	// session.save(s); 
    	
    	//telusko = (Alien) session.get(Alien.class, 101);
    	
    	session2.getTransaction().commit();
    	session2.close();  */
    	
    	
    	// form here we write code for hibernate states 
    	
    	
       Configuration con = new Configuration().configure().addAnnotatedClass(LaptopForStates.class);
    	
    	
    	SessionFactory sf = con.buildSessionFactory();
    	
    	Session session = sf.openSession();
    
    	
    	session.beginTransaction();
    	
    	Random r = new Random();
    	
    	for(int i=1; i<=50; i++) 
    	{
    		LaptopForStates laptop = new LaptopForStates();
    		laptop.setLid(i);
    		laptop.setBrand("Brand"+i);
    		laptop.setPrice(r.nextInt(1000));
    		session.save(laptop);
    	}
    	
    	session.getTransaction().commit();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }  	
    	
}
