package org.springframework.online.store.discounts.model;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

    @Query("SELECT ptype FROM PaymentType ptype ORDER BY ptype.name")
    List<PaymentType> findPetTypes();

    @Query("FROM PaymentType ptype WHERE ptype.id = :typeId")
    Optional<PaymentType> findPetTypeById(@Param("typeId") int typeId);
}
