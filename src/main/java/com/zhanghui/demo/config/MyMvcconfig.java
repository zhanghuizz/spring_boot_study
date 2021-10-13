package com.zhanghui.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.zhanghui.demo.component.MyLocalResolver;

import java.util.List;

@Configuration
public class MyMvcconfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
      registry.addViewController("/").setViewName("index");
      registry.addViewController("/index.html").setViewName("index");
      registry.addViewController("/main.html").setViewName("dashboard");
    }

    @Bean
    public LocaleResolver localeResolver(){return new MyLocalResolver();}


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new loginHandlerIntercepter())
                .addPathPatterns("/**")
                .excludePathPatterns("/index.html","/","/login","/css/**","/js/**","/img/**");
    }
}
