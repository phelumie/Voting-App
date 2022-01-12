package com.project.election.Controller;

import com.project.election.Entity.Aspirant;
import com.project.election.Entity.Post;
import com.project.election.dto.VotesReceived;
import com.project.election.Service.AspirantService;
import com.project.election.Service.PostService;
import com.project.election.Service.VotesReceivedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RepositoryRestController
@RestController
@CrossOrigin("http://localhost:4200")
public class SaveVotes {

    @Autowired
    private AspirantService aspirantService;
    @Autowired
    private VotesReceivedService votesReceivedService;
    @Autowired
    private PostService postService;


    @GetMapping("/aspirants")
    public List<Aspirant> getAspirants() {
        return aspirantService.getAllAspirants();
    }
    @GetMapping("/posts")
    public List<Post> getPosts() {
        return postService.getAllPosts();
    }
    @PostMapping("/saveVotes")
    public void saveVotes(@RequestBody VotesReceived votesReceived) {
        votesReceivedService.save(votesReceived);
    }
}
