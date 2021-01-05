package br.dev.diego.dsdelivery.repositories;

import br.dev.diego.dsdelivery.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long>{

    List<Product> findAllByOrderByNameAsc();

}
