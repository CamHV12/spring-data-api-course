package vn.spring.api.business.domain.product;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.Accessors;
import vn.spring.api.business.domain.category.ProductCategoryRequestBodyData;
import vn.spring.api.business.domain.category.ProductCategoryResponseData;

@Value
@Builder
@Accessors(fluent = true)
public class ProductRequetBodyData {
	private String id;
	private LocalDateTime dateCreated;
	private LocalDateTime lastUpdated;
}
