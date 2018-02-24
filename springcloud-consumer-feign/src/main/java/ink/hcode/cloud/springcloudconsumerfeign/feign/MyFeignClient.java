package ink.hcode.cloud.springcloudconsumerfeign.feign;

import ink.hcode.cloud.springcloudconsumerfeign.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @version 1.0
 * @auther Administrator
 * @date 2018/2/24
 * @description
 */
@org.springframework.cloud.netflix.feign.FeignClient("springcloud-provider")
public interface MyFeignClient {

    @GetMapping("/user/{id}")
    User getUser(@PathVariable("id") String id);

    @PostMapping("/postUser")
    User postUser(@RequestBody User user);

}
