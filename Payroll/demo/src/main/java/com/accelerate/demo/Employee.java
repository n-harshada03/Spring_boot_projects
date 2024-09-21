package com.accelerate.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Employee {


    private @Id
    @GeneratedValue Long id;
    private String name;
    private String role;

    Employee(String name,String role){
        this.role=role;
        this.name=name;

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) obj;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name) && Objects.equals(this.role, employee.role);

    }
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role);
    }

    public String toString(){
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';

    }


}