package com.example.MyShop;

import org.h2.server.web.JakartaWebServlet; // 'WebServlet' 대신 'JakartaWebServlet'을 써야 합니다!
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ServletRegistrationBean<JakartaWebServlet> h2Console() {
        // H2 2.x 버전 이상에서 Jakarta 환경을 지원하는 클래스를 직접 등록합니다.
        JakartaWebServlet servlet = new JakartaWebServlet();
        return new ServletRegistrationBean<>(servlet, "/h2-console/*");
    }
}
