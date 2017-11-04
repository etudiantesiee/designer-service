package fr.esiee.pic.designer;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Demarrage de l'application
 * @author etudiant
 *
 */
@SpringBootApplication
public class Application {
 
    public static final Logger LOGGER = LogManager.getLogger(Application.class.getName());
    
    /**
     * Main class
     */
    public static void main(String[] args) {
        LOGGER.info("entered application");
        
        SpringApplication.run(Application.class, args);
    }
}
