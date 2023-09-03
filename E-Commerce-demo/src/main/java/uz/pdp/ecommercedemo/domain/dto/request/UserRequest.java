package uz.pdp.ecommercedemo.domain.dto.request;

import lombok.*;
import uz.pdp.ecommercedemo.domain.entity.enums.UserRole;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserRequest {

    private String name;

    private String username;

    private String password;

    private Double balance;

    private String phoneNumber;
    private String chatId;

    private List<UserRole> roles;
}
