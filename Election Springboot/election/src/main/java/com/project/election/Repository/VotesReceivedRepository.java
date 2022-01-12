package com.project.election.Repository;

import com.project.election.dto.VotesReceived;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotesReceivedRepository extends JpaRepository<VotesReceived,Long> {
}
