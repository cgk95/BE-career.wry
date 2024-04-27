package kr.co.careerwrymember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CareerwryMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(CareerwryMemberApplication.class, args);
    }

}
