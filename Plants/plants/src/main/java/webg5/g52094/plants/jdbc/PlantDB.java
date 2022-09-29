package webg5.g52094.plants.jdbc;

import org.springframework.data.repository.CrudRepository;
import webg5.g52094.plants.model.Plant;

public interface PlantDB extends CrudRepository<Plant, Integer> {

}
