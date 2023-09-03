package uz.pdp.ecommercedemo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import uz.pdp.ecommercedemo.domain.entity.UserEntity;
import uz.pdp.ecommercedemo.domain.entity.enums.UserRole;
import uz.pdp.ecommercedemo.domain.entity.enums.UserState;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;


}