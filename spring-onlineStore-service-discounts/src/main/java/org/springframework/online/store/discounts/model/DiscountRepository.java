package org.springframework.online.store.discounts.model;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DiscountRepository extends JpaRepository<Discount, Integer> { }
