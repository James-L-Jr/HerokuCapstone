package com.hcl.udemy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.hcl.udemy.domain.User;
import com.hcl.udemy.repositories.UserRepository;
import com.hcl.udemy.services.UserService;
import javax.xml.ws.Service;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CapstoneApplicationTests {
    @Autowired
    public UserService serviceTest;

    @MockBean
    public UserRepository repoTest;

    @Test
    public void FindAllUsersTest(){
        long userTestId = 1;
        User test = new User();
        test.setId(userTestId);
        test.setUsername("test@test.com");
        test.setFullName("Demo User");
        test.setPassword("password");

        //when(repositoryTest.findAll()).thenReturn(Stream
        //        .of(test).collect(Collectors.toList()));

        //Iterable<User> list = serviceTest.findAll();
        repoTest.save(test);

        Assertions.assertThat(test.getId()).isGreaterThan(0);
    }
}