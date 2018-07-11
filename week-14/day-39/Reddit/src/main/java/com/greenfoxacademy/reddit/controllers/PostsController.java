package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostsController {

    private final PostService postService;

    @Autowired
    public PostsController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> getAllPost() {
        return postService.getAllElements();
    }

    @PostMapping("/posts")
    public List<Post> addCustomer(@RequestBody Post[] posts) {
        for (Post actualPost: posts) {
            postService.addElement(actualPost);
        }
        return postService.getAllElements();}




    /*
    @PostMapping("customers")
    public List<Customer> addCustomer(@RequestBody Customer[] customers) {
        for (Customer actCustomer: customers) {
            customerService.addElement(actCustomer);
        }
        return customerService.getAllElements();*/
}
