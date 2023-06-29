package vn.spring.api.business.domain.category;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductCategoryResponseData {
	private String id;
	private String categoryName;
	private String categoryDescription;
}
