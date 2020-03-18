package monitoring.application.entity.data;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class User extends BaseEntity {

    @Column(name = "username", nullable = false, unique = true, updatable = false)
    private String username;

    @Column(name = "password", nullable = false, unique = true, updatable = false)
    private String password;




}
