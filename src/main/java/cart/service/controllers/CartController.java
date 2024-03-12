package cart.service.controllers;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;


@RestController
public class CartController {
    final CartService cartService = new CartService();

    @GetMapping("/carts/")
    public CartDto[] getAllCarts() {
        return cartService.getAllCarts();
    }

    @GetMapping("/carts/{id}/")
    public CartDto getCartById(@PathVariable Long id) {
        return cartService.getCartById(id);
    }

    @GetMapping("/carts")
    public CartDto[] getCartsInADateRange(@RequestParam LocalDate startdate, @RequestParam LocalDate enddate) {
        return cartService.getCartsInADateRange(startdate, enddate);
    }

    @PostMapping("/carts")
    public CreateOrUpdateProductsResponse postAddANewProduct(@RequestBody CreateOrUpdateProductsRequestBody body) {
        return cartService.addNewProducts(body.userId, body.date, body.products);
    }

    @PutMapping("/carts/{id}")
    public ResponseEntity<HttpStatus> patchUpdateProducts(@PathVariable Long id,@RequestBody CreateOrUpdateProductsRequestBody body) {
        cartService.updateProducts(id, body.userId, body.date, body.products);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/carts/{id}")
    public ResponseEntity<HttpStatus> deleteCart(@PathVariable Long id) {
        cartService.deleteCartById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
