package com.main.buff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication // springBoot에서 이 클래스가 Main 클래스임을 알려주는 어노테이션
public class BuffApplication extends SpringBootServletInitializer{
	
	/* SpringBootServletInitializer 상속받아 configure 재정의
	 * 
	 * WAS에 war파일을 배포할 때 springBoot 내용을 servlet으로 초기화해주는 역할
	 * 기존의 jar 프로젝트로 생성했을 경우 일반 어플리케이션용 혹은 내장 was를 이용해 웹 서버를 실행하고 서비스를 제공하는 형태대신, 
	 * war 프로젝트로 생성할 경우 위와 같이 was에 배포될때 springBoot어플리케이션을 servlet으로 등록하여 서비스될 수 있도록 제공
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BuffApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BuffApplication.class, args);
	}

}