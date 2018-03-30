package com.cq.girl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("cn.sunxyz.mapper")
public class GirlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GirlApplication.class, args);
	}
}
