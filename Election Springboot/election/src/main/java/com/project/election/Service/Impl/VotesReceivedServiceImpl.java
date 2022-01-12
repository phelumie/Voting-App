package com.project.election.Service.Impl;

import com.project.election.dto.VotesReceived;
import com.project.election.Repository.VotesReceivedRepository;
import com.project.election.Service.VotesReceivedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VotesReceivedServiceImpl  implements VotesReceivedService {
    @Autowired
    private VotesReceivedRepository votesReceivedRepository;

    @Override
    public void save(VotesReceived votesReceived) {
        votesReceivedRepository.save(votesReceived);

    }
}
