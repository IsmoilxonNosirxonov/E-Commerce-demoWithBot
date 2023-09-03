package uz.pdp.ecommercedemo.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.ecommercedemo.domain.entity.ProductEntity;
import uz.pdp.ecommercedemo.domain.entity.UserEntity;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BasketCreateDto {

    private UserEntity user;
    private ProductEntity product;
    private Integer amount;
    private Double totalPrice;

}
