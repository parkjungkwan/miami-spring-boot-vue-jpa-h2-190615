package com.demo.web.repositories;

import java.util.stream.Stream;

// import com.bitcamp.web.common.util.Printer;
import com.bitcamp.web.repositories.CustomerRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepositoryTest {

    @Autowired private CustomerRepository customerRepository;
   // @Autowired private Printer p;
    

    @Test
    public void inspect(){
        Class<?> clz = customerRepository.getClass();
       // p.accept(clz.getName());
       System.out.println("이름: "+clz.getName());
       Class<?>[] interfaces = clz.getInterfaces();
       Stream.of(interfaces).forEach(x -> System.out.println(x.getName()));
       Class<?> superClasses = clz.getSuperclass();
       System.out.println(superClasses.getName());
    }
}