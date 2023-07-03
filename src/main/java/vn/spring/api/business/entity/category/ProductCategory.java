package vn.spring.api.business.entity.category;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.spring.api.business.entity.product.Product;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "productCategory")
public class ProductCategory {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "categoryName")
    private String categoryName;
    @Column(name = "categoryDescription")
    private String categoryDescription;

    @OneToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE,
    }, fetch = FetchType.LAZY,
    mappedBy = "category")
    private List<Product> products = new ArrayList<>();
}
