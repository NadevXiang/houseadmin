package xyz.ruankun.houseadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"xyz.ruankun.houseadmin"})
@MapperScan("xyz.ruankun.houseadmin.mapper")
@EnableSwagger2
public class HouseadminApplication {
	public static void main(String[] args) {
		SpringApplication.run(HouseadminApplication.class, args);
	}
}
