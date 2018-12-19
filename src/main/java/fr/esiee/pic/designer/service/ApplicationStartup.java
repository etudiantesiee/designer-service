package fr.esiee.pic.designer.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import fr.esiee.pic.designer.design.evaluation.DessinGroupe1;
import fr.esiee.pic.designer.design.evaluation.DessinGroupe2;
import fr.esiee.pic.designer.design.evaluation.DessinGroupe3;
import fr.esiee.pic.designer.design.exemple.MaisonAvecCercleEtEllipse;
import fr.esiee.pic.designer.design.exemple.PersonnageManga;
import fr.esiee.pic.designer.domain.shapes.ElementGraphique;
import fr.esiee.pic.designer.domain.tools.CreateurDeForme;
import fr.esiee.pic.designer.repository.ElementGraphiqueRepository;

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
    private ElementGraphiqueService elementgraphiqueService;
    
    /**
     * Element grpahique repo
     */
    @Autowired
    private ElementGraphiqueRepository elementgraphiqueREpo;
    
    @Value("${service.startup.shapes.deleteall}")
    private boolean deleteAllShapesAtStartup;
    
    @Override
    public void onApplicationEvent(ApplicationReadyEvent arg0) {
        
        if(deleteAllShapesAtStartup) {
            LOGGER.info("Tous les dessins seront supprimés avant l'ajout des nouveaux");
            elementgraphiqueService.deleteAll();
        }
        
        LOGGER.info("Création des composants graphiques de l'application");
        PersonnageManga manga = new PersonnageManga("MangaEsiee");
        add(manga);
        
        MaisonAvecCercleEtEllipse maisonAvecCercleEtEllipse = new MaisonAvecCercleEtEllipse("maisonAvecCercleEtEllipse");
        add(maisonAvecCercleEtEllipse);
        
        DessinGroupe2 grp2 = new DessinGroupe2("grp2");
        add(grp2);
        
        DessinGroupe1 grp1 = new DessinGroupe1("grp1");
        add(grp1);
        
        DessinGroupe3 grp3 = new DessinGroupe3("grp3");
        add(grp3);
        
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
        
        ElementGraphique eltGraphiqueExistant = elementgraphiqueREpo.findByNom(nom);
        
        if(eltGraphiqueExistant != null) {
            LOGGER.info("L'élément graphique " + nom + " existe déjà. Il sera mis à jour.");
            g.setId(eltGraphiqueExistant.getId());
        } else {
            LOGGER.info("L'élément graphique " + nom + " n'existe pas encore. Il sera crée.");
        }

        // Persistance
        elementgraphiqueService.saveOrUpdate(g);
        
        LOGGER.info("Sauvegarde du graphique : " + nom + " terminé avec succes");
    }

}
