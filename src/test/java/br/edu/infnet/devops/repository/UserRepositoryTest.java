package br.edu.infnet.devops.repository;

import br.edu.infnet.devops.model.User;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Mock
    private UserRepository userRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @DisplayName("Save User")
    public void saveTest() {
        var user = new User(1L, "Alguem por ai", 25);
        Mockito.when(userRepository.save(user)).thenReturn(user);
        User newUser = userRepository.save(user);

        Assertions.assertEquals(user.getId(), newUser.getId());
        Assertions.assertEquals(user.getName(), newUser.getName());
        Assertions.assertEquals(user.getAge(), newUser.getAge());
    }

    @Test
    @DisplayName("find user by Id")
    public void findyByIdTest() {
        var user = new User(1L, "Alguem por ai", 25);
        Mockito.when(userRepository.getById(1L)).thenReturn(user);
        User searchUser = userRepository.getById(1L);

        Assertions.assertEquals(user.getId(), searchUser.getId());
        Assertions.assertEquals(user.getName(), searchUser.getName());
        Assertions.assertEquals(user.getAge(), searchUser.getAge());
    }

    @Test
    @DisplayName("find all")
    public void findAllTest() {
        List<User> users = List.of(new User(1L, "1", 25), new User(2L, "2", 26));
        Mockito.when(userRepository.findAll()).thenReturn(users);
        List<User> search = userRepository.findAll();

        Assertions.assertEquals(users.size(), search.size());
    }

    @Test
    @DisplayName("Delete by id")
    public void deleteByIdTest() {
        userRepository.deleteById(1L);
        Mockito.verify(userRepository).deleteById(1L);
    }

}