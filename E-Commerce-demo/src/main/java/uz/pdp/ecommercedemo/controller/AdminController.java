package uz.pdp.ecommercedemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import uz.pdp.ecommercedemo.domain.dto.BaseResponse;
import uz.pdp.ecommercedemo.domain.entity.CategoryEntity;
import uz.pdp.ecommercedemo.domain.dto.request.CategoryCreateDto;
import uz.pdp.ecommercedemo.service.CategoryService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
@EnableMethodSecurity
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {

    private final CategoryService categoryService;

    @PostMapping(value = "/create")
    public ModelAndView createCategory(@ModelAttribute CategoryCreateDto categoryCreateDto
    ){
        ModelAndView modelAndView=new ModelAndView("menu");
        BaseResponse<CategoryEntity> save = categoryService.save(categoryCreateDto);
        modelAndView.addObject("categories",categoryService.getAll());
        modelAndView.addObject("message",save.getMessage());
        return modelAndView;
    }

    @PostMapping(value = "/delete")
    public ModelAndView deleteCategory(@RequestParam(name = "id") Long categoryId) {
        ModelAndView modelAndView=new ModelAndView("menu");
        categoryService.delete(categoryId);
        modelAndView.addObject("categories", categoryService.getAll());
        modelAndView.addObject("message","Category successfully deleted!");
        return modelAndView;
    }

    @GetMapping(value = "/update")
    public ModelAndView updateCategory(@RequestBody CategoryCreateDto categoryCreateDto,
                                       @RequestParam(name = "id") Long id
    ){
        ModelAndView modelAndView=new ModelAndView("menu");
        categoryService.update(categoryCreateDto,id);
        modelAndView.addObject("categories",categoryService.getAll());
        modelAndView.addObject("message","Category successfully updated!");
        return modelAndView;
    }
}
