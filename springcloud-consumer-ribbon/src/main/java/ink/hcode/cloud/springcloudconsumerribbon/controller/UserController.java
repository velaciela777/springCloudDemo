package ink.hcode.cloud.springcloudconsumerribbon.controller;

import ink.hcode.cloud.springcloudconsumerribbon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @auther Administrator
 * @date 2018/2/24
 * @description
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") String id) {
        return this.restTemplate.getForObject("http://springcloud-provider/user/" + id, User.class);
    }

}
