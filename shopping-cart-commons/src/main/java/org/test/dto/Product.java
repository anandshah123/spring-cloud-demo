package org.test.dto;


import java.io.Serializable;

/**
 * Created by anandshah on 31/05/15.
 */

public class Product implements Serializable{


    private Long id;

    private String name;

    private String image;

    private String description;

    public Product(String name, String image, String description) {
        this.name = name;
        this.image = image;
        this.description = description;
    }

    public Product(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != product.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
