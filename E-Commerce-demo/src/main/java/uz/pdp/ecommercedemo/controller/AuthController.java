package uz.pdp.ecommercedemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.pdp.ecommercedemo.domain.dto.BaseResponse;
import uz.pdp.ecommercedemo.domain.entity.UserEntity;
import uz.pdp.ecommercedemo.domain.dto.request.UserRequest;
import uz.pdp.ecommercedemo.service.UserService;


@Controller
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @GetMapping("/reg")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
    public String register(
            @ModelAttribute UserRequest userCreateDto, Model model
    ) {
        BaseResponse<UserEntity> save = userService.save(userCreateDto);
        model.addAttribute("users", userService.getAll());
        model.addAttribute("message",save.getMessage());
        return "menu";
    }

}
