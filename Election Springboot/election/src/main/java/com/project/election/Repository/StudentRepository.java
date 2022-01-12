package com.project.election.Repository;

import com.project.election.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;


@CrossOrigin("http://localhost:4200")
//@RepositoryRestResource(collectionResourceRel = "productCategory", path = "stdents")
public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findByMatricNumber(String num);
    Student save(Student student);
}
