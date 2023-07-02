package vn.spring.api.business.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import vn.spring.api.business.application.product.GetRequestProductApplication;
import vn.spring.api.business.application.product.GetRequestProductInput;
import vn.spring.api.business.application.product.GetRequestProductOutput;
import vn.spring.api.business.domain.category.ProductCategoryResponseData;
import vn.spring.api.business.domain.product.ProductRequetBodyData;
import vn.spring.api.business.domain.product.ProductResponseData;

@RestController
@CrossOrigin(origins = { "http://localhost:3000", "http://127.0.0.1:5500" })
@RequiredArgsConstructor
public class ExampleProjectController {
	private final GetRequestProductApplication getRequestProductApplication;

	@RequestMapping(value = "/api/session/index", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<ProductResponseData> getindex() {
		ProductResponseData body = new ProductResponseData();

		return new ResponseEntity<>(body, HttpStatus.OK);
	}

	@ExceptionHandler(Exception.class)
	@RequestMapping(value = "/api/session/product/{id}", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<ProductResponseData> sessionApiRequestProductGet(@PathVariable("id") String id) {
		ProductResponseData body = new ProductResponseData();
		GetRequestProductInput input = GetRequestProductInput.builder().id(id).build();
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
		return new ResponseEntity<>(body, HttpStatus.OK);
	}

}
