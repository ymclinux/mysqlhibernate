package com.ymc.hibernate;

import java.util.List;


import com.ymc.domain.Employee;
import com.ymc.domain.Department;
import com.ymc.util.*;
 
import org.hibernate.*;
 
public class HibernateTest {
 
public static void main(String[] args) {
          
        Session session = HibernateUtil.getSessionFactory().openSession();
  
        session.beginTransaction();
 
        Department department = new Department("java","hibernate");
        session.save(department);
 
        session.save(new Employee("Yogesh chaudhari",department,34l));
        session.save(new Employee("Aditya chaudhari",department,03l));
      
        session.getTransaction().commit();
 
        Query q = session.createQuery("From Employee ");
                 
        List<Employee> resultList = q.list();
        System.out.println("num of employess:" + resultList.size());
        for (Employee next : resultList) {
            System.out.println("next employee: " + next);
        }
 
    }
    
}