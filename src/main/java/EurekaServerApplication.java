import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.webTemplate.config.web",  // MVC @Configuration
        "com.webTemplate.config.security", // Security @Configuration
        "com.webTemplate.config.jpa", // Database @Configuration -> does Entity Scan and Repository scan
        "com.webTemplate.service", // Service scan @Service
        "com.webTemplate.controler", // Controller scan @Controller
})
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}