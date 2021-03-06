package ink.hcode.cloud.springcloudprovider.controller;

import ink.hcode.cloud.springcloudprovider.entity.User;
import ink.hcode.cloud.springcloudprovider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.userRepository.findOne(id);
    }

    @PostMapping("/postUser")
    public User postUser(@RequestBody User user){
        return user;
    }
}
