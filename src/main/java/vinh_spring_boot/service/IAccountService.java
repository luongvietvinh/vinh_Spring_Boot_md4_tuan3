package vinh_spring_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vinh_spring_boot.model.Accounts;
import vinh_spring_boot.repository.IAccountRepo;

import java.util.ArrayList;
import java.util.List;


public interface IAccountService {
    public List<Accounts> findAll();
    public Page<Accounts> findAll(Pageable pageable);
    public void save(Accounts accounts);
    public void delete(long id);
    public Accounts findById(long id);
    public ArrayList<Accounts> findByName (String name);
    public List<Accounts> sortByName();
    Long countAccount();
}
