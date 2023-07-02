package com.example.testing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private  StudentRepository underTest;

    @Test
    void itShouldCheckIfStudentExistsEmail() {
        //given
        String email = "nicksonkipkorir25@gmail.com";
       Student student = Student.builder().name("nickson").email(email).gender(Gender.MALE).build();
        underTest.save(student);
        //when
        Boolean exists =  underTest.selectExistsEmail(email);

        //then

        assertThat(exists).isTrue();

    }
}