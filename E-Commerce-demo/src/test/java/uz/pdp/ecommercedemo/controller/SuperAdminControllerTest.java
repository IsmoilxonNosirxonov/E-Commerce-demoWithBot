package uz.pdp.ecommercedemo.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import uz.pdp.ecommercedemo.service.UserService;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
class SuperAdminControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;


//    @Test
//    @WithMockUser(username = "qwer", roles = "SUPER_ADMIN")
//    void deleteUserTest() throws Exception {
//
//        MvcResult result = mockMvc.perform(
//                post("/superAdmin/delete")
//                        .contentType(MediaType.APPLICATION_JSON)
//        ).andReturn();
//        userService.delete(2L);
//        MockHttpServletResponse response = result.getResponse();
//
//        String contentAsString = response.getContentAsString();
//
//        JsonNode jsonNode = objectMapper.readTree(contentAsString);
//        assertNotNull(jsonNode.get("id"));
//    }

}