package com.di.spring_di_annotation_configuration_bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberMain {

	public static void main(String[] args) {
		// 스프링 컨테이너 생성
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("application-context6.xml");
		
		// 빈가져오기
		Member member = context.getBean("member", Member.class);
		System.out.println(member);  // toString() 자동 호출
		member.showBMI();
	
		context.close();
	}

}