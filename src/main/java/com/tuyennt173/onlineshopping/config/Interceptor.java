package com.tuyennt173.onlineshopping.config;

import com.tuyennt173.onlineshopping.interceptor.GlobalInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Interceptor implements WebMvcConfigurer {

    @Autowired
    private GlobalInterceptor globalInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(globalInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/api/**", "/admin/**", "/assets/**");
    }
}
