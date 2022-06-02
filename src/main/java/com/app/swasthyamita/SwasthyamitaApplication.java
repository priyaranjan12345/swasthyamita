package com.app.swasthyamita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwasthyamitaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwasthyamitaApplication.class, args);
    }

//    @Bean
//    public Docket swaggerConfiguration() {
//        return new Docket(DocumentationType.SWAGGER_2).select()
//                .paths(PathSelectors.ant("/swasthyamita"))
//                .apis(RequestHandlerSelectors.basePackage("com.app.swasthyamita"))
//                .build();
//    }

}
