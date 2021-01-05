package br.dev.diego.dsdelivery.repositories;

import br.dev.diego.dsdelivery.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
