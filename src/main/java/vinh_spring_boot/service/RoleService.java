package vinh_spring_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vinh_spring_boot.model.Role;
import vinh_spring_boot.repository.IRoleRepo;

import java.util.List;

@Service
public class RoleService implements IRoleService{
    @Autowired
    IRoleRepo roleRepo;
    @Override
    public List<Role> findAll() {
        return (List<Role>) roleRepo.findAll();
    }
}
