package vinh_spring_boot.repository;

import org.springframework.data.repository.CrudRepository;
import vinh_spring_boot.model.Role;

public interface IRoleRepo extends CrudRepository<Role , Long> {
}
