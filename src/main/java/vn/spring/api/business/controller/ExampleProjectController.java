package vn.spring.api.business.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import vn.spring.api.business.application.product.GetRequestProductApplication;
import vn.spring.api.business.application.product.GetRequestProductInput;
import vn.spring.api.business.application.product.GetRequestProductOutput;
import vn.spring.api.business.domain.category.ProductCategoryResponseData;
import vn.spring.api.business.domain.product.ProductRequetBodyData;
import vn.spring.api.business.domain.product.ProductResponseData;

@RestController
@RequiredArgsConstructor
public class ExampleProjectController {
	private final GetRequestProductApplication getRequestProductApplication;

	@RequestMapping(value = "/api/session/product", produces = { "application/json" }, method = RequestMethod.GET)
	public ProductResponseData sessionApiRequestProductGet(@RequestBody ProductRequetBodyData productResponseData) {
		ProductResponseData body = new ProductResponseData();
		GetRequestProductInput input = GetRequestProductInput.builder().id(productResponseData.id())
				.dateCreated(productResponseData.dateCreated()).lastUpdated(productResponseData.lastUpdated()).build();
		GetRequestProductOutput output = getRequestProductApplication.start(input);
		body.setId(output.id());
		body.setName(output.name());
		body.setSku(output.sku());
		body.setDescription(output.description());
		body.setActive(output.active());
		body.setPrice(output.price());
		body.setImageUrl(output.imageUrl());
		body.setDateCreated(output.dateCreated());
		ProductCategoryResponseData category = new ProductCategoryResponseData();
		category.setId(output.category().id());
		category.setCategoryName(output.category().categoryName());
		category.setCategoryDescription(output.category().categoryDescription());
		body.setCategory(category);
		return body;
	}

}
