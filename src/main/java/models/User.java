package models;

import jakarta.persistence.*;

@Entity
@Table(name = "Tb_User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_user;

    @Column(name = "username", length = 15)
    private String username;
    @Column(name = "password", length = 25)
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_role", referencedColumnName = "id_role")
    private Role role;

    @Column(name = "email", length = 50)
    private String email;

    private boolean status;
}
