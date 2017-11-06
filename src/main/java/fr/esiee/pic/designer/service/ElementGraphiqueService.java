package fr.esiee.pic.designer.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import fr.esiee.pic.designer.domain.shapes.CheminDePoints;
import fr.esiee.pic.designer.domain.shapes.Couleur;
import fr.esiee.pic.designer.domain.shapes.ElementGraphique;
import fr.esiee.pic.designer.domain.shapes.Ellipse;
import fr.esiee.pic.designer.repository.CouleurRepository;
import fr.esiee.pic.designer.repository.ElementGraphiqueRepository;

@Service
public class ElementGraphiqueService {
    
    /**
     * Logger
     */
    public static final Logger LOGGER = LogManager.getLogger(ElementGraphiqueService.class.getName());
    
    /**
     * Element grpahique repo
     */
    @Autowired
    private ElementGraphiqueRepository elementgraphiqueRepo;
    
    /**
     * Couleur repo
     */
    @Autowired
    private CouleurRepository couleurRepo;
    
    /**
     * Save or update an element
     * 
     * @param eltGraphique
     */
    public ElementGraphique saveOrUpdate(ElementGraphique eltGraphique) {
        List<Ellipse> ellipses = eltGraphique.getEllipses();
        List<CheminDePoints> cheminsDePoints = eltGraphique.getFormesAvecPoints();
        
        // Update des couleurs d'ellipse si elles existent avec leur id
        if(ellipses != null) {
            for(Ellipse ellipse : ellipses) {
                Couleur eCouleur = ellipse.getCouleur();
                
                updateCouleurWithId(eCouleur);
            }
        }
        
        // Update des couleurs de chemin de points si elles existent avec leur id
        if(cheminsDePoints != null) {
            for(CheminDePoints cheminDePoints : cheminsDePoints) {
                Couleur cCouleur = cheminDePoints.getCouleur();
                Couleur cCouleurTraitLiaison = cheminDePoints.getCouleurTraitsLaison();
                
                updateCouleurWithId(cCouleur);
                updateCouleurWithId(cCouleurTraitLiaison);
            }
        }
        
        return elementgraphiqueRepo.save(eltGraphique);
    }
    
    /**
     * Delete all element service
     */
    public void deleteAll() {
        this.elementgraphiqueRepo.deleteAll();
    }
    
    /**
     * Update a color instance with his id if the color already exists in database.
     * If the color does not exist it is persisted
     * @param couleur
     */
    private void updateCouleurWithId(Couleur couleur) {
        if(couleur == null) {
            return;
        }
        
        List<Couleur> couleursIdentiques = couleurRepo.findAll(Example.of(couleur));
        
        if(couleursIdentiques != null && couleursIdentiques.size() > 0) {
            // Couleur trouvé en base
            String couleurId = couleursIdentiques.get(0).getId(); 
            LOGGER.info("La couleur " + couleur + " existe déjà en base. "
                    + "Elle sera mise dans son entity avec l'id " + couleurId);
            couleur.setId(couleurId);
        } else {
            // Persistance de la couleur
            LOGGER.info("La couleur " + couleur + " n'existe pas en base. Elle sera persisté.");
            Couleur couleurPersiste = couleurRepo.save(couleur);
            couleur.setId(couleurPersiste.getId());
        }
        
        couleurRepo.save(couleur);
    }

    
}
