package vn.spring.api.business.application.product;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import vn.spring.api.business.domain.category.ProductCategoryData;

@Service
@Transactional
@RequiredArgsConstructor
public class GetRequestProductApplication {
	public GetRequestProductOutput start(GetRequestProductInput input) {
		GetRequestProductOutput output = GetRequestProductOutput.builder().id(null).name(null).sku(null)
				.description(null).active(false).price(null).imageUrl(null).dateCreated(null).lastUpdated(null)
				.category(ProductCategoryData.builder().build()).build();
		return output;
	}

}
