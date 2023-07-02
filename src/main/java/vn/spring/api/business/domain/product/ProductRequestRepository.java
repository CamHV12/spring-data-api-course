package vn.spring.api.business.domain.product;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductRequestRepository {

	ProductRequestDomainDto findProductById(String id);

}
