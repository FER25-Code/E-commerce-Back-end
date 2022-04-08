package com.example.ecommrce;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Table("product")
@AllArgsConstructor
public class ProductModel {
    @Id
    private int id;

    @Column( nullable = false)
    private String titer ;
    @Column( nullable = false)
    private String price ;

    @Column( nullable = false)
    private String path_image;

    public ProductModel() {

    }
}
