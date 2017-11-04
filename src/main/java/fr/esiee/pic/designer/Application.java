package fr.esiee.pic.designer;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Demarrage de l'application
 * @author etudiant
 *
 */
@SpringBootApplication
@EnableSwagger2
public class Application {
 
    public static final Logger LOGGER = LogManager.getLogger(Application.class.getName());
    
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
    
    /**
     * Main class
     */
    public static void main(String[] args) {
        LOGGER.info("entered application");
        SpringApplication.run(Application.class, args);
    }
}
