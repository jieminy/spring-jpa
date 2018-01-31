package com.jm.spring.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringJpaApplicationTest {
    private Logger logger = LoggerFactory.getLogger(SpringJpaApplicationTest.class);
    @Autowired
    private PersonRepository personRepository;

    @Test
    public void testJpaRepository(){
        personRepository.findByNameAndAddress("zhangsan","泰康").forEach(person -> {
            logger.debug(person.toString());
        });
    }
}
