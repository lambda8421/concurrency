package com.mofei.concurrency;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        System.out.println("ServletInitializer");
		return application.sources(ConcurrencyApplication.class);
	}

}