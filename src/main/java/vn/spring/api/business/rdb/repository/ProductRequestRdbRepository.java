package vn.spring.api.business.rdb.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import vn.spring.api.business.domain.product.ProductRequestDomainDto;
import vn.spring.api.business.domain.product.ProductRequestRepository;
import vn.spring.api.business.entity.product.Product;

@Service
public class ProductRequestRdbRepository implements ProductRequestRepository {

	public ProductRequestRdbRepository(ProductRequestJpaRepository productRequestJpaRepository) {
		super();
		this.productRequestJpaRepository = productRequestJpaRepository;
	}

	private final ProductRequestJpaRepository productRequestJpaRepository;

	@Override
	public ProductRequestDomainDto findProductById(String id) {
		Optional<Product> product = productRequestJpaRepository.findById(id);
		var dto = product.stream()
				.map(it -> ProductRequestDomainDto.builder().id(it.getId()).name(it.getName()).build()).findFirst()
				.orElse(null);
		return dto;
	}

}
