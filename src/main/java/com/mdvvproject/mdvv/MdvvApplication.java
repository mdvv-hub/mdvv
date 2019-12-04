package com.mdvvproject.mdvv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ServletComponentScan(basePackages = {"com.mdvvproject.*"})
@MapperScan(basePackages = {"com.mdvvproject.mdvv.dao"})
//@EnableCaching
@EnableTransactionManagement    //开启事务
public class MdvvApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdvvApplication.class, args);
	}

}
