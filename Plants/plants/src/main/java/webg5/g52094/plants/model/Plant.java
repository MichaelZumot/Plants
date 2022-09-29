package webg5.g52094.plants.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import webg5.g52094.plants.model.enums.Season;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plant {

    @NotBlank(message = "Name cannot be empty (or made with spaces!)")
    @Id
    public int id;

    @NotBlank(message = "Name cannot be empty!")
    private String name;

    @NotBlank(message = "Name cannot be empty!")
    @Enumerated(EnumType.STRING)
    private Season plantingSeason;

    private String description;

}
