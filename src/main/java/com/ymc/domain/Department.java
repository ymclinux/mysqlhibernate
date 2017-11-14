package com.ymc.domain;


import java.util.ArrayList;
import java.util.List;
 
import javax.persistence.*;
 
@Entity
@Table
public class Department {
 
    @Id
    @GeneratedValue
    private Long id;
 
     
    private String name;
    
    private String fullname;
     
    @OneToMany(mappedBy="department",cascade=CascadeType.PERSIST)
    private List<Employee> employees = new ArrayList<Employee>();
      
    public Department() {
        super();
    }
    public Department(String name,String fname) {
        this.name = name;
        this.fullname = fname;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}