package vn.spring.api.business.rdb.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Service;

import com.querydsl.core.Tuple;
import com.querydsl.jpa.JPQLTemplates;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.querydsl.sql.SQLQueryFactory;
import com.querydsl.sql.SQLTemplates;

import lombok.RequiredArgsConstructor;
import vn.spring.api.business.domain.product.ProductRequestDomainDto;
import vn.spring.api.business.domain.product.ProductRequestQueryService;
import vn.spring.api.business.entity.product.QProduct;

@Service
@RequiredArgsConstructor
public class ProductRequestRdbQueryService implements ProductRequestQueryService {
	private final SQLQueryFactory queryFactory;

	@Override
	public ProductRequestDomainDto getProductbyId(String id) {
		QProduct qProduct = QProduct.product;
		List<Tuple> tuple = queryFactory.select(qProduct.id, qProduct.name, qProduct.dateCreated, qProduct.lastUpdated)
				.from(qProduct).where(qProduct.id.endsWith(id)).fetch();
		ProductRequestDomainDto dto = tuple.stream()
				.map(it -> ProductRequestDomainDto.builder().id(it.get(qProduct.id)).name(it.get(qProduct.name))
						.dateCreated(it.get(qProduct.dateCreated)).lastUpdated(it.get(qProduct.lastUpdated)).build())
				.findFirst().orElse(null);
		return dto;
	}

}
