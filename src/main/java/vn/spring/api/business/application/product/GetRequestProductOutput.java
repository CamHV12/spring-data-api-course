package vn.spring.api.business.application.product;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.Accessors;
import vn.spring.api.business.domain.category.ProductCategoryData;

@Value
@Builder(toBuilder = true)
@Accessors(fluent = true)
public class GetRequestProductOutput {
	private String id;
	private String sku;
	private String name;
	private String description;
	private BigDecimal price;
	private boolean active;
	private String imageUrl;
	private LocalDate dateCreated;
	private LocalDate lastUpdated;
	private ProductCategoryData category;
}
