package vn.spring.api.business.domain.product;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.spring.api.business.domain.category.ProductCategoryResponseData;

@Setter
@Getter
@NoArgsConstructor
public class ProductResponseData {
	private String id;
	private String sku;
	private String name;
	private String description;
	private BigDecimal price;
	private boolean active;
	private String imageUrl;
	private LocalDate dateCreated;
	private LocalDate lastUpdated;
	private ProductCategoryResponseData category;
}
