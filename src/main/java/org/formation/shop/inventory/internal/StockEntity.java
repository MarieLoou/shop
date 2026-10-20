package org.formation.shop.inventory.internal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class StockEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Getter
    private Long coffeeId;
    private int quantity;

    protected StockEntity() {}

    public StockEntity(Long coffeeId, int quantity) {
        this.coffeeId = coffeeId;
        this.quantity = quantity;
    }


}
