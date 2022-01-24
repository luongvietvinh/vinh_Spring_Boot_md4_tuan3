package vinh_spring_boot.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String passWord;
    private String fullName;
    private String phoneNumber;
    private String email;
    private String img;
    @ManyToOne
    private Role role;
}
