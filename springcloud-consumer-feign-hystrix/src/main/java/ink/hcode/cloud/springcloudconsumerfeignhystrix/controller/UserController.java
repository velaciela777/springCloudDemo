package ink.hcode.cloud.springcloudconsumerfeignhystrix.controller;

import ink.hcode.cloud.springcloudconsumerfeignhystrix.entity.User;
import ink.hcode.cloud.springcloudconsumerfeignhystrix.feign.MyFeignClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @auther Administrator
 * @date 2018/2/24
 * @description
 */
@Api
@RestController
public class UserController {

    @Autowired
    private MyFeignClient myFeignClient;

    @ApiOperation(value = "根据用户id查询用户信息", httpMethod = "GET", produces = "application/json")
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") String id) {
        return this.myFeignClient.getUser(id);
    }

    @ApiOperation(value = "post请求", httpMethod = "POST", produces = "application/json")
    @PostMapping("/postUser")
    public User postUser(User user) {
        return this.myFeignClient.postUser(user);
    }
}
