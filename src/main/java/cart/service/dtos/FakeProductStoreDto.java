package cart.service.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeProductStoreDto {
    private Long id;
    private String title;
    private String description;
    private String category;
    private String image;
    private double price;
}
