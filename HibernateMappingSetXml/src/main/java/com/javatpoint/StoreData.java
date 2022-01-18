package com.javatpoint;  
  
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
    
public class StoreData {  
 public static void main(String[] args) {  
    
	 StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
	 
    Transaction t=session.beginTransaction();  
      
    Set<String> list1=new HashSet<String>();  
    list1.add("java is a programming language");  
    list1.add("java is a platform");  
      
    Set<String> list2=new HashSet<String>();  
    list2.add("Servlet is an Interface");  
    list2.add("Servlet is an API");  
      
    Question question1=new Question();  
    question1.setQname("What is Java?");  
    question1.setAnswers(list1);  
      
    Question question2=new Question();  
    question2.setQname("What is Servlet?");  
    question2.setAnswers(list2);  
      
    session.persist(question1);  
    session.persist(question2);  
      
    t.commit();  
    session.close();  
    System.out.println("success");  
 }  
}  