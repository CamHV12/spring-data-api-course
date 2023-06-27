package vn.spring.api.business.entity.product;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Builder;
import lombok.Data;
import lombok.Value;
import vn.spring.api.business.entity.category.ProductCategory;

@Entity
@Data
@Value
@Builder
@Table(name = "products", schema = "sxpp_business", uniqueConstraints = {
		@UniqueConstraint(name = "sku_unique", columnNames = "stoke_keeping_unit")

})
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "stoke_keeping_unit", nullable = false)
	private String sku;
	@Column(nullable = false)
	private String name;
	private String description;
	private BigDecimal price;
	private boolean active;
	private String imageUrl;
	@CreationTimestamp
	private LocalDateTime dateCreated;
	@UpdateTimestamp
	private LocalDateTime lastUpdated;
	@ManyToOne
	@JoinColumn(name = "category_id", referencedColumnName = "id")
	private ProductCategory category;
}
