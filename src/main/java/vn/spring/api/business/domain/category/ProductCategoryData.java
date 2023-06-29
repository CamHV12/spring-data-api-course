package vn.spring.api.business.domain.category;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.Accessors;

@Value
@Builder
@Accessors(fluent = true)
public class ProductCategoryData {
    private String id;
    private String categoryName;
    private String categoryDescription;
}
