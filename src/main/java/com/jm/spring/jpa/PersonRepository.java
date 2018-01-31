package com.jm.spring.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Long> {
    List<Person> findByNameAndAddress(String name, String address);
    List<Person> findByAgeBetween(Integer min, Integer max);
}
