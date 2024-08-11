package foltan.domain.service;
import java.util.List;

import foltan.domain.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import foltan.domain.entity.Role;

@Service
public class RoleService{

	@Autowired
    private RoleRepository roleRepository;
    
	public List<Role> findAll() {
		return roleRepository.findAll();
	}
	
	public Role findByName(String role) {
		return roleRepository.findByRole(role);
	}
	
	public Role save(Role role) {
		return roleRepository.save(role);
	}
	
	public List<Role> saveAll(List<Role> roles) {
		return roleRepository.saveAll(roles);
	}
	
	public Long count() {
		return roleRepository.count();
	}
	
	public Role findByRoleName(String roleName) {
		return roleRepository.findByRole(roleName);
	}
	
}