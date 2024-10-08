package foltan.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import foltan.domain.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	
    Role findByRole(String role);
    
}