package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
//标识Feign
@SpringCloudApplication  //包含了@EnableDiscoveryClient标识了是个Eureka客户端
@EnableFeignClients
//@EnableHystrix   不用加， @SpringCloudApplication包含了@EnableCircuitBreaker
public class RunAppCustomerHystrix {
	
	public static void main(String[] args) {
		SpringApplication.run(RunAppCustomerHystrix.class, args);
	}

}
