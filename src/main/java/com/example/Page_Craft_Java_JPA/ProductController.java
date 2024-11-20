package com.example.Page_Craft_Java_JPA;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            return new ResponseEntity<>(optionalProduct.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

//TODO
//    @PostMapping
//    public ResponseEntity<Product> createProduct(@RequestBody Product item) {
//
//
//         Optional<Product> existingProduct = productRepository.findAll().stream().anyMatch(existingProduct -> existingProduct.getName().equalsIgnoreCase(item.getName()));
//
//        if (existingProduct.isPresent()) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//        Product savedProduct = productRepository.save(item);
//        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProductById(@PathVariable Long id) {
        productRepository.deleteById(id);
        return new ResponseEntity<>("borrado", HttpStatus.OK);
    }


}
