package vn.spring.api.business.application.product;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.Accessors;

@Value
@Builder
@Accessors(fluent = true)
public class GetRequestProductInput {
	private int id;
	

}
