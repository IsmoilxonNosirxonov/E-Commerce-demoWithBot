package uz.pdp.ecommercedemo.service;

import org.springframework.stereotype.Service;
import uz.pdp.ecommercedemo.domain.dto.BaseResponse;

import java.util.List;

@Service
public interface BaseService<E, CD> {

    BaseResponse<E> save(CD createDto);
    void delete(Long id);
    E update(CD createDto, Long id);
    BaseResponse<E> getById(Long id);
    List<E> getAll();

}
