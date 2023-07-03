package vn.spring.api.business.domain.product;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
public interface ProductRequestQueryService {

	ProductRequestDomainDto getProductbyId(String id);

}
