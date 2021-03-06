package ink.hcode.cloud.springcloudconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableSwagger2
public class SpringcloudConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConsumerFeignApplication.class, args);
	}
}
