package com.example.restaurantmenu.models;

import com.example.restaurantmenu.dtos.FoodRequestDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

@Entity (name = "foods")
@Table (name = "tb_foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class FoodModel extends RepresentationModel<FoodModel> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFood;
    private String title;
    private String image;
    private Integer price;

    public FoodModel (FoodRequestDto data) {
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }
}
