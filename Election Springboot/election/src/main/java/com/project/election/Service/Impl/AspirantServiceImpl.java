package com.project.election.Service.Impl;

import com.project.election.Entity.Aspirant;
import com.project.election.Repository.AspirantRepository;
import com.project.election.Service.AspirantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AspirantServiceImpl implements AspirantService {
    @Autowired
    private AspirantRepository aspirantRepository;

    public AspirantServiceImpl(AspirantRepository aspirantRepository) {
        super();
        this.aspirantRepository = aspirantRepository;
    }

    @Override
    public List<Aspirant> getAllAspirants() {
        return aspirantRepository.findAll();
    }
}
