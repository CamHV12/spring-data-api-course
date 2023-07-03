package vn.spring.api.business.application.product;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import vn.spring.api.business.domain.category.ProductCategoryData;
import vn.spring.api.business.domain.product.ProductRequestDomainDto;
import vn.spring.api.business.domain.product.ProductRequestQueryService;
import vn.spring.api.business.domain.product.ProductRequestRepository;

@Service
@Transactional(rollbackOn = Exception.class)
@RequiredArgsConstructor
public class GetRequestProductApplication {
	private final ProductRequestQueryService productRequestQueryService;
	private final ProductRequestRepository productRequestRepository;

	public GetRequestProductOutput start(GetRequestProductInput input) {
		ProductRequestDomainDto dto1 = productRequestQueryService.getProductbyId(input.id());
		ProductRequestDomainDto dto = productRequestRepository.findProductById(input.id());
//		ProductRequestDomainDto dto = ProductRequestDomainDto.builder().build();
		GetRequestProductOutput output = GetRequestProductOutput.builder().id(dto.id()).name(dto.name()).sku(dto.sku())
				.description(dto.description()).active(dto.active()).price(dto.price()).imageUrl(dto.imageUrl())
				.dateCreated(dto.dateCreated()).lastUpdated(dto.lastUpdated())
				.category(ProductCategoryData.builder().build()).build();
		return output;
	}

}
