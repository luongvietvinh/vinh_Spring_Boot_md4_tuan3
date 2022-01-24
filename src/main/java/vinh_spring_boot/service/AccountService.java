package vinh_spring_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vinh_spring_boot.model.Accounts;
import vinh_spring_boot.repository.IAccountRepo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class AccountService implements IAccountService {
    @Autowired
    IAccountRepo accountRepo;

    @Override
    public List<Accounts> findAll() {
        return (List<Accounts>) accountRepo.findAll();
    }

    @Override
    public Page<Accounts> findAll(Pageable pageable) {
        return accountRepo.findAll(pageable);
    }

    @Override
    public void save(Accounts accounts) {
        accountRepo.save(accounts);
    }

    @Override
    public void delete(long id) {
        accountRepo.deleteById(id);
    }

    @Override
    public Accounts findById(long id) {
        return accountRepo.findById(id).get();
    }

    @Override
    public ArrayList<Accounts> findByName(String name) {
        return accountRepo.findAllByName(name);
    }

    @Override
    public List<Accounts> sortByName() {
        List<Accounts> list = findAll();
        list.sort(Comparator.comparing(Accounts::getUserName));
        return list;
    }

    @Override
    public Long countAccount() {
        return accountRepo.countAccount();
    }
}
