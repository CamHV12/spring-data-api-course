package vn.spring.api.business.application.product;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;
import lombok.experimental.Accessors;

@Value
@Builder(toBuilder = true)
@Accessors(fluent = true)
public class GetRequestProductOutput {
	private int id;
}
