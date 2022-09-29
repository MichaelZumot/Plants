package webg5.g52094.plants.business;

import java.util.Optional;

import javax.persistence.EntityExistsException;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webg5.g52094.plants.jdbc.PlantDB;
import webg5.g52094.plants.model.Plant;


@Service
public class PlantsService {

    private static final Logger log = LoggerFactory.getLogger("Plant_Inventory_Application.java");

    @Autowired
    PlantDB plants_db;


    public Iterable<Plant> getAllPlants() {
        Iterable<Plant> plants = plants_db.findAll();
        return plants;
    }

    

    // public Optional<Plant> getPlantById(String plant_id) {
    //     if (plant_id == null || plant_id.isEmpty()) {
    //         throw new IllegalArgumentException("id not valid");
    //     }
    //     return plant_id.findById(plant_id);
    // }

    // public void addArtist(@Valid Plant newPlant) throws IllegalArgumentException, EntityExistsException {
    //     if (artist_db.existsById(newPlant.getLogin())) {
    //         throw new EntityExistsException("login already taken!");
    //     }
    //     if (newPlant.getLogin() == null) {
    //         throw new IllegalArgumentException("login cannot be null!");
    //     }
    //     artist_db.save(newPlant);
    //     log.info("new artist is saved with credentials:" + newPlant.getLogin() + "-" + newPlant.getName());
    // }

}
