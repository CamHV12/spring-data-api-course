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
@Table(name = "product", uniqueConstraints = {
		@UniqueConstraint(name = "sku_unique", columnNames = "sku")

})
public class Product {
	@Id
	private String id;
	@Column(name = "sku", nullable = false)
	private String sku;
	
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "price")
	private BigDecimal price;
	@Column(name = "active")
	private boolean active;
	@Column(name = "imageUrl")
	private String imageUrl;
	@CreationTimestamp
	@Column(name = "dateCreated")
	private LocalDate dateCreated;
	@UpdateTimestamp
	@Column(name = "lastUpdated")
	private LocalDate lastUpdated;
	@ManyToOne
	@JoinColumn(name = "category", referencedColumnName = "id")
	private ProductCategory category;
}
