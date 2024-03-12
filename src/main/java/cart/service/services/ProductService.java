package cart.service.services;

import org.springframework.stereotype.Service;
import cart.service.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getSingleProduct(Long id);

    Product createProduct(Product product);
}