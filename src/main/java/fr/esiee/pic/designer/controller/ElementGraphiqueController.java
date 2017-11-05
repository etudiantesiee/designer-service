package fr.esiee.pic.designer.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.esiee.pic.designer.Application;
import fr.esiee.pic.designer.domain.shapes.ElementGraphique;
import fr.esiee.pic.designer.repository.ElementGraphiqueRepository;


@RestController
@RequestMapping(path = "/items", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ElementGraphiqueController {
    
    /**
     * Logger
     */
    public static final Logger LOGGER = LogManager.getLogger(Application.class.getName());
    
    /**
     * Element grpahique repo
     */
    @Autowired
    ElementGraphiqueRepository elementgraphiqueRepo;
    
    /**
     * All segmentSynoptic
     * 
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public HttpEntity<List<ElementGraphique>> findElementGraphique(ElementGraphique elementGraphique) {
        List<ElementGraphique> allElts;
        
        LOGGER.info("Received data : " + elementGraphique);
        if (elementGraphique == null || (elementGraphique.getId() == null && elementGraphique.getNom() == null)) {
            LOGGER.info("Récupération de tous les elements graphiques");
            allElts = this.elementgraphiqueRepo.findAll();
        } else {
            LOGGER.info("Recherche d'un element graphique spécifique. "
                    + "Les criteres de recherche sur l'id et le nom sont : "
                    + "id = " + elementGraphique.getId() + " Nom = " + elementGraphique.getNom());
            allElts = this.elementgraphiqueRepo.findAll(Example.of(elementGraphique));
        }
        
        if (allElts == null) {
            LOGGER.info("Aucun élément graphique trouvé");
            return new ResponseEntity<List<ElementGraphique>>(HttpStatus.NOT_FOUND);
        }
        
        return new ResponseEntity<List<ElementGraphique>>(allElts, HttpStatus.OK);
    }
}
