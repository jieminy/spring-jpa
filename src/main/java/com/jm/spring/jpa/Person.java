package com.jm.spring.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    private Long number;
    private String name;
    private Integer age;
    private String address;

    @Id
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "name: " + getName() + ",age: " + getAge() + ",address: " + getAddress();
    }
}
