package vn.spring.api.business.entity.product;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;
import vn.spring.api.business.entity.category.ProductCategory;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "products", uniqueConstraints = {
		@UniqueConstraint(name = "sku_unique", columnNames = "stoke_keeping_unit")

})
public class Product {
	@Id
	private String id;
	@Column(name = "stoke_keeping_unit", nullable = false)
	private String sku;
	@Column(nullable = false)
	private String name;
	private String description;
	private BigDecimal price;
	private boolean active;
	private String imageUrl;
	@CreationTimestamp
	private LocalDate dateCreated;
	@UpdateTimestamp
	private LocalDate lastUpdated;
	@ManyToOne
	@JoinColumn(name = "category_id", referencedColumnName = "id")
	private ProductCategory category;
}
