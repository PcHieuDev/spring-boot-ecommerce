package com.luv2code.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "product")
@Getter
@Setter

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne // Many products can belong to one category
    @JoinColumn(name = "category_id", nullable = false) // category_id is the foreign key in the product table
    private ProductCategory category; // category is the name of the field in the Product class

    @Column(name = "sku")
    private String sku;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name="unit_price")
    private double unitPrice;
    @Column(name="image_url")
    private String imageUrl;
    @Column(name="active")
    private boolean active;
    @Column(name="units_in_stock")
    private int unitsInStock;

    @Column(name="date_created")
    @CreationTimestamp
    private String dateCreated;
    @Column(name="last_updated")
    @UpdateTimestamp
    private String lastUpdated;

}
