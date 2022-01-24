package vinh_spring_boot.service;

import vinh_spring_boot.model.Accounts;
import vinh_spring_boot.model.Role;

import java.util.List;

public interface IRoleService {
    public List<Role> findAll();

}
