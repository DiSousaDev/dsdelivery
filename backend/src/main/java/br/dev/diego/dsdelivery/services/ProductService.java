package br.dev.diego.dsdelivery.services;

import br.dev.diego.dsdelivery.dto.OrderDTO;
import br.dev.diego.dsdelivery.dto.ProductDTO;
import br.dev.diego.dsdelivery.entities.Order;
import br.dev.diego.dsdelivery.entities.Product;
import br.dev.diego.dsdelivery.entities.enums.OrderStatus;
import br.dev.diego.dsdelivery.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll(){
        List<Product> list = repository.findAllByOrderByNameAsc();
        return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
    }

    @Transactional
    public ProductDTO insert(ProductDTO dto){
        Product product = new Product(null, dto.getName(), dto.getPrice(), dto.getDescription(), dto.getImageUri());
        product = repository.save(product);
        return new ProductDTO(product);
    }

}
