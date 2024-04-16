package kr.co.careerwry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CareerwryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CareerwryApplication.class, args);
    }

}
