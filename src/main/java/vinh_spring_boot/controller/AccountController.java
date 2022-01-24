package vinh_spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vinh_spring_boot.model.Accounts;
import vinh_spring_boot.service.IAccountService;
import vinh_spring_boot.service.IRoleService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping ("/account")
public class AccountController {
    @Autowired
    IAccountService accountService;
    @Autowired
    IRoleService roleService;

    @GetMapping
    public ResponseEntity<List<Accounts>> findAll(){
        return new  ResponseEntity<>(accountService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/count")
    public ResponseEntity<Long> countAcc(){
        return new  ResponseEntity<>(accountService.countAccount(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Accounts> create(@RequestBody Accounts accounts) {
        accountService.save(accounts);
        return new ResponseEntity<>(accounts,HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Accounts> findById(@PathVariable long id) {
        return new ResponseEntity<>(accountService.findById(id),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable long id){
         accountService.delete(id);
         return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Accounts> edit(@PathVariable long id ,@RequestBody Accounts accounts) {
        accounts.setId(id);
        accountService.save(accounts);
        return new ResponseEntity<>(accounts,HttpStatus.OK);
    }
    @GetMapping("/find/{name}")
    public  ResponseEntity<List<Accounts>> findById(@PathVariable String name){
       return new ResponseEntity<>( accountService.findByName(name) , HttpStatus.OK);
    }
}
