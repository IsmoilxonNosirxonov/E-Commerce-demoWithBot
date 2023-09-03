package uz.pdp.ecommercedemo.domain.dto.request;

import uz.pdp.ecommercedemo.domain.entity.enums.UserState;

public record UserStateDto (String chatId, UserState state){
}
