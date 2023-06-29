package vn.spring.api.business.application.product;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.Accessors;

@Value
@Builder
@Accessors(fluent = true)
public class GetRequestProductInput {
	private String id;
	private LocalDateTime dateCreated;
	private LocalDateTime lastUpdated;

}
