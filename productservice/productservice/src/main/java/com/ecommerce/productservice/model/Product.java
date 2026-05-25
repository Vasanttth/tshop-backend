package com.ecommerce.productservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Long id;

    private String name;
    private String brand;
    private String category;

    private String size;
    private String color;
    private String gender;
    private String material;

    private double price;
    private int stock;

    @Column(length = 1000)
    private String description;

    private String imageUrl;
}