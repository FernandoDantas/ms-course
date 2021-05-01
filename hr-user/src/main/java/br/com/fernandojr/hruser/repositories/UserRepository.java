package br.com.fernandojr.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fernandojr.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
	
}
