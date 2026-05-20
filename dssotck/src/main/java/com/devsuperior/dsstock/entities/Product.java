package com.devsuperior.dsstock.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb_product")
public class Product {

    @Id
    private UUID id;
    // UUID muito utilizado para poder gerar um codigo aleatorio com ID;
    private String name;
    private Double price;
    private Integer quantity;

}
