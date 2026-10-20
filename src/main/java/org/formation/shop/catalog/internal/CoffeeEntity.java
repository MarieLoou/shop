package org.formation.shop.catalog.internal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class CoffeeEntity {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    private String name;
    private int price;

    protected CoffeeEntity() {}

    public CoffeeEntity(String name, int price) {
        this.name = name;
        this.price = price;
    }

}
