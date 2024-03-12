package cart.service.dtos;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter 
@Setter
public class CartDto {
    Long id;
    Long userId;
    LocalDate date;
    CartProductDto[] products;
}
