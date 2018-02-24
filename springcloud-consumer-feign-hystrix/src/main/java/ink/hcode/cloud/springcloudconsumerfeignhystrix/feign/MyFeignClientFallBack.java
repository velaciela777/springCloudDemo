package ink.hcode.cloud.springcloudconsumerfeignhystrix.feign;

import ink.hcode.cloud.springcloudconsumerfeignhystrix.entity.User;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @auther Administrator
 * @date 2018/2/24
 * @description
 */

@Component
public class MyFeignClientFallBack implements MyFeignClient {
    @Override
    public User getUser(String id) {
        return null;
    }

    @Override
    public User postUser(User user) {
        return null;
    }
}
