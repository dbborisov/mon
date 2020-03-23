package monitoring.application.entity.data;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class User extends BaseEntity {

    @Column(name = "username", nullable = false, unique = true, updatable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @OneToMany(mappedBy = "user", targetEntity = SucardInstance.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<SucardInstance> instances;


}
