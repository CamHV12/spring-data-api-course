package vn.spring.api.business.domain.product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.Accessors;
import vn.spring.api.business.domain.category.ProductCategoryResponseData;

@Value
@Builder
@Accessors(fluent = true)
public class ProductRequestDomainDto {
	private String id;
	private String sku;
	private String name;
	private String description;
	private BigDecimal price;
	private boolean active;
	private String imageUrl;
	private LocalDate dateCreated;
	private LocalDate lastUpdated;
	private ProductCategoryRequestDomainDto category;

	@Accessors(fluent = true)
	@Value
	@Builder(toBuilder = true)

	public static class ProductCategoryRequestDomainDto {
		private String id;
		private String categoryName;
		private String categoryDescription;
	}

}
