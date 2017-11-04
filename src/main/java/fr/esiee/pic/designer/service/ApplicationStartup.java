package fr.esiee.pic.designer.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import fr.esiee.pic.designer.Application;
import fr.esiee.pic.designer.design.exemple.PersonnageManga;
import fr.esiee.pic.designer.domain.shapes.ElementGraphique;
import fr.esiee.pic.designer.domain.shapes.Ellipse;
import fr.esiee.pic.designer.domain.tools.CreateurDeForme;
import fr.esiee.pic.designer.repository.ElementGraphiqueRepository;
import fr.esiee.pic.designer.repository.EllipseRepository;

/**
 * @author etudiant
 *
 */
@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {
    
    /**
     * Logger
     */
    public static final Logger LOGGER = LogManager.getLogger(Application.class.getName());
    
    /**
     * Element grpahique repo
     */
    @Autowired
    ElementGraphiqueRepository elementgraphiqueRepo;
    
    @Autowired
    EllipseRepository ellipseRepo;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent arg0) {
        LOGGER.info("Créateur des composants graphiques de l'application");
        PersonnageManga manga = new PersonnageManga("Figure 10");
        add(manga);
        
        LOGGER.info("Les composants graphiques de l'application ont été crées");
    }
    
    /**
     * Procède à l'initialisation des composants graphiques de l'application
     */
    private void add(CreateurDeForme dessin) {
        // Exécution du dessin
        dessin.dessiner();
        
        // Generation de l'élément graphique
        ElementGraphique g = dessin.getElementGraphique();
        String nom = g.getNom();
        
        LOGGER.info("Sauvegarde du graphique : " + nom + " en cours...");

        // Persistance
        elementgraphiqueRepo.save(g);
        
        LOGGER.info("Sauvegarde du graphique : " + nom + " terminé avec succes");
    }

}
