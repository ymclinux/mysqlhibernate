package com.ymc.domain;

import javax.persistence.*;
  
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
 
    private String name;
    
    private Long age;
    
     
    @ManyToOne
    private Department department;
 
    public Employee() {}
 
    public Employee(String name, Department department,Long age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }
     
 
    public Employee(String name) {
        this.name = name;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    
    public Long getAge() {
        return age;
    }
 
    public void setAge(Long age) {
        this.age = age;
    }
 
    
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Department getDepartment() {
        return department;
    }
 
    public void setDepartment(Department department) {
        this.department = department;
    }
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name +" Age =" + age + ", department="
                + department.getName() + "]" + "full name :" + department.getFullname()+"" ;
    }
 
}