package com.uberclone.core.foodservice.configuration;

import com.uberclone.core.foodservice.interceptor.SessionInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SessionHandlerConfiguration implements WebMvcConfigurer {
    @Autowired
    private SessionInterceptor sessionInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(sessionInterceptor)
                .addPathPatterns("/api/**") // Specify the URL patterns to intercept
                .excludePathPatterns("/api/auth/**"); // Optionally exclude some paths from being intercepted
    }
}
