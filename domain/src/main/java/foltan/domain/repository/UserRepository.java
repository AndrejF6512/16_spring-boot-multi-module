package foltan.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import foltan.domain.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
    public User findByUsername(String username);
    
}
