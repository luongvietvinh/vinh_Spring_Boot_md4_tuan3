package vinh_spring_boot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import vinh_spring_boot.model.Accounts;

import java.util.ArrayList;
import java.util.List;

public interface IAccountRepo extends PagingAndSortingRepository<Accounts, Long> {
    @Query(value = "select u from Accounts u where u.userName like concat('%' ,:name, '%')")
    ArrayList<Accounts> findAllByName(@Param("name") String name);

    @Query(nativeQuery = true, value = "select count(id) from accounts;")
    Long countAccount();
}
