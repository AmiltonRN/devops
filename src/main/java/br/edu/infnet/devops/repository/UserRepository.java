package br.edu.infnet.devops.repository;

import br.edu.infnet.devops.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
