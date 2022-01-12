package com.project.election.Repository;

import com.project.election.Entity.Aspirant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;



@CrossOrigin("http://localhost:4200")
public interface AspirantRepository extends JpaRepository<Aspirant, Long> {


}
