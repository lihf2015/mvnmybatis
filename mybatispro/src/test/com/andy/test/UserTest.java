package com.andy.test;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.andy.model.UserDto;
import com.andy.service.UserService;
 
 
 
public class UserTest {
 
private UserService userService;
     
    @Before
    public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userServiceImpl");
    }
     
    @Test
    public void addUser(){
        UserDto user = new UserDto();
        user.setUsername("廖大马");
        user.setPassword("111111");
        user.setEmail("123@126.com");
        System.out.println(userService.insertUser(user));
    }
}