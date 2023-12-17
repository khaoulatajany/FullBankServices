package org.sid.orderservice.repo;

import org.sid.orderservice.entities.ProductItem;
import org.sid.orderservice.entities.order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<order,Long> {
}
