package fr.esiee.pic.designer.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import fr.esiee.pic.designer.design.exemple.MaisonAvecCercleEtEllipse;
import fr.esiee.pic.designer.design.exemple.PersonnageManga;
import fr.esiee.pic.designer.domain.shapes.ElementGraphique;
import fr.esiee.pic.designer.domain.tools.CreateurDeForme;

/**
 * @author etudiant
 *
 */
@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {
    
    /**
     * Logger
     */
    public static final Logger LOGGER = LogManager.getLogger(ApplicationStartup.class.getName());
    
    /**
     * Element grpahique service
     */
    @Autowired
    ElementGraphiqueService elementgraphiqueService;
    
    @Override
    public void onApplicationEvent(ApplicationReadyEvent arg0) {
        LOGGER.info("Suppression de l'ancienne configuration");
        elementgraphiqueService.deleteAll();
        
        LOGGER.info("Créateur des composants graphiques de l'application");
        PersonnageManga manga = new PersonnageManga("MangaEsiee");
        add(manga);
        
        MaisonAvecCercleEtEllipse maisonAvecCercleEtEllipse = new MaisonAvecCercleEtEllipse("maisonAvecCercleEtEllipse");
        add(maisonAvecCercleEtEllipse);
        
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
        elementgraphiqueService.saveOrUpdate(g);
        
        LOGGER.info("Sauvegarde du graphique : " + nom + " terminé avec succes");
    }

}
