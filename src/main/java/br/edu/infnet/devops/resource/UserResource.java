package br.edu.infnet.devops.resource;

import br.edu.infnet.devops.dto.UserDto;
import br.edu.infnet.devops.model.User;
import br.edu.infnet.devops.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserResource {

    final static Logger logger = LoggerFactory.getLogger(UserResource.class);
    @Autowired
    UserRepository userRepository;

    @GetMapping(produces = "application/json")
    public List<User> findAll() {
        logger.info("findAll");
        return userRepository.findAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public User findById(@PathVariable("id") Long id) {
        logger.info("findById");
        return userRepository.findById(id).orElseThrow();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody UserDto userRequest) {
        logger.info("save");
        User user = new User();
        user.setAge(userRequest.getAge());
        user.setName(userRequest.getName());
        return userRepository.saveAndFlush(user);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User update(@PathVariable("id") Long id, @RequestBody UserDto userData) {
        logger.info("update");
        User user = userRepository.findById(id).orElseThrow();
        user.setAge(userData.getAge());
        user.setName(userData.getName());

        return userRepository.saveAndFlush(user);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        logger.info("delete");
        userRepository.deleteById(id);
    }

}
