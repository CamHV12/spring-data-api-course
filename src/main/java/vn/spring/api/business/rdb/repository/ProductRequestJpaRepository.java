package vn.spring.api.business.rdb.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.spring.api.business.entity.product.Product;

public interface ProductRequestJpaRepository extends JpaRepository<Product, String> {
	Optional<Product> findById(String id);
}
