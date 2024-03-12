package cart.service.dtos.services;

import cart.service.dtos.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter

public class crops {
    Long id;
    Long userId;
    LocalDate date;
    CartProductDto[] products;
}
