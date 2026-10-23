package com.example.javaJenkinsTemplate;

import com.example.javaJenkinsTemplate.controller.HelloController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    @Test
    void testSayHello() {
        HelloController controller = new HelloController();
        assertEquals("Hello WOrld", controller.sayHello());
    }
}