package vn.spring.api.business.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import vn.spring.api.business.application.product.GetRequestProductApplication;
import vn.spring.api.business.application.product.GetRequestProductOutput;
import vn.spring.api.business.domain.product.ProductResponseData;

@RestController
@RequiredArgsConstructor
public class ExampleProjectController {
	private GetRequestProductApplication getRequestProductApplication;
	
	public ResponseEntity<ProductResponseData> sessionApiRequestProductGet(){
		ProductResponseData body = null;
		GetRequestProductOutput output = getRequestProductApplication.start(null);
		body = ProductResponseData.builder().build();
		return ResponseEntity.ok(body);
	}

}
