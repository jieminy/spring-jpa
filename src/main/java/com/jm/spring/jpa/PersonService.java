package com.jm.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    public List<Person> findByNameAndAdress(String name,String adress){
        return personRepository.findByNameAndAddress(name,adress);
    }
}
