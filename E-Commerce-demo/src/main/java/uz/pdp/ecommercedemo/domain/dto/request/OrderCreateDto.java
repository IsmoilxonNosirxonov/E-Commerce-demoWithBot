package uz.pdp.ecommercedemo.domain.dto.request;

import lombok.*;
import uz.pdp.ecommercedemo.domain.entity.ProductEntity;
import uz.pdp.ecommercedemo.domain.entity.UserEntity;
import uz.pdp.ecommercedemo.domain.entity.enums.OrderStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderCreateDto {
    private ProductEntity product;
    private UserEntity user;
    private Integer amount;
    private Double totalPrice;
    private OrderStatus status;
}