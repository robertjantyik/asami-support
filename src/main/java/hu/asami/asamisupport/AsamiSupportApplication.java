package hu.asami.asamisupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "hu.asami" })
public class AsamiSupportApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsamiSupportApplication.class, args);
    }

}
