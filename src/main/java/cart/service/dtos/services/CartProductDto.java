package cart.service.dtos.services;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartProductDto {
    Long productId;
    Long quantity;
}
