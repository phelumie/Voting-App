package com.project.election.Repository;

import com.project.election.Entity.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository underTest;

    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }

    @BeforeEach
    void setUp() {

    }

    @Test
    void findByMatricNumber() {
        //give
        Student student= Student.builder()
                .id(1L).level("400").matricNumber("SCI/17/18/0224").hasVoted(false).name("sunday")
                .build();
        underTest.save(student);
        //when
        Student expected=underTest.findByMatricNumber("SCI/17/18/0224");

        //Then
        assertThat(expected.getName()).isEqualTo(student.getName());
    }

    @Test
    void save() {
        Student students= Student.builder()
                .id(100L).level("400").matricNumber("SCI/17/18/02245").hasVoted(false).name("shola")
                .build();
        Student expected =underTest.save(students);
        assertThat(expected.getMatricNumber()).isEqualTo(students.getMatricNumber());
    }
}